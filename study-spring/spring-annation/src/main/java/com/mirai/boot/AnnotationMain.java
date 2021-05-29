package com.mirai.boot;

import com.mirai.boot.anno.AnnotationBean;
import com.mirai.boot.config.Config;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author mirau on 2021/5/25.
 * @version 1.0
 */
public class AnnotationMain {

    public static void main(String[] args) {
        useXmlConfig();
    }

    public static void useXmlConfig() {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("context.xml");
        context.refresh();
        AnnotationBean bean = context.getBean(AnnotationBean.class);
        System.out.println(bean.echo("你好呀"));
    }

    public static void useClassConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context);
        AnnotationBean bean = context.getBean(AnnotationBean.class);
        System.out.println(bean.echo("你好呀"));
    }

}
