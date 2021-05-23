package com.mirai.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author mirau on 2021/5/23.
 * @version 1.0
 */
public class CglibProxy implements MethodInterceptor {
    private final Object object;

    private CglibProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        try {
            return Enhancer.create(object.getClass(), new CglibProxy(object));
        } catch (Throwable e) {
            e.printStackTrace();
            throw new Error(e.getMessage());
        }
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //Exclude the methods such as toString in the Object class.
        System.out.println("开始cglib代理");
        Object result;
//      We usually use the proxy.invokeSuper(obj,args) method. This is easy to understand - it is the method to implement the original class.
//      There is a another method: proxy.invoke(obj,args), which is a method to implement the subclass generated.
//      If the incoming object is a subclass, an out-of-memory exception will occur, because the subclass method enters the intercept method constantly
//      , and this method again comes to invoke the subclass method, which leads to loop calls of the two methods.
        result = methodProxy.invokeSuper(obj, args);
////    result = methodProxy.invoke(obj, args);
        System.out.println("cglib代理结束");
        return result;
    }

}
