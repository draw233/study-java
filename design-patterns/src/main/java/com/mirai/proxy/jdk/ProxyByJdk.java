package com.mirai.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mirau on 2021/5/23.
 * @version 1.0
 */
public class ProxyByJdk implements InvocationHandler {
    private final Object object;

    private ProxyByJdk(Object object) {
        this.object = object;
    }

    public static Object createProxy(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new ProxyByJdk(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret;
        try {
            System.out.println("JDK动态代理开始");
            ret = method.invoke(object, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } finally {
            System.out.println("JDK动态代理结束");
        }
        return ret;

    }
}