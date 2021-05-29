package com.mirai.boot;

import com.mirai.boot.service.HelloService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author mirau on 2021/5/25.
 * @version 1.0
 */
public class XmlMain {

    public static void main(String[] args) {

        useGenericApplicationContext();
    }

    public static void useClassPathXmlApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        HelloService helloService1 = context.getBean(HelloService.class);
        HelloService helloService2 = (HelloService) context.getBean("myHello");
        HelloService helloService3 = context.getBean("myHello", HelloService.class);

        System.out.println(helloService1.hello());
        System.out.println(helloService1.equals(helloService2));
        System.out.println(helloService1.equals(helloService3));
    }

    public static void useGenericApplicationContext() {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml");
        context.refresh();
        HelloService helloService = context.getBean("myHello", HelloService.class);
        System.out.println(helloService.hello());
    }
}
