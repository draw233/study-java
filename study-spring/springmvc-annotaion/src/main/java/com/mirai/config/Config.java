package com.mirai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 该类的作用与xml 配置作用一样
 * <?xml version="1.0" encoding="UTF-8"?>
 * <beans xmlns="http://www.springframework.org/schema/beans"
 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 * xmlns:p="http://www.springframework.org/schema/p"
 * xmlns:context="http://www.springframework.org/schema/context"
 * xsi:schemaLocation="
 * http://www.springframework.org/schema/beans
 * https://www.springframework.org/schema/beans/spring-beans.xsd
 * http://www.springframework.org/schema/context
 * https://www.springframework.org/schema/context/spring-context.xsd">
 * <p>
 * <context:component-scan base-package="org.mirai"/>
 * <tx:annotation-driven proxy-target-class="true"/>
 * <!-- ... -->
 *
 * </beans>
 *
 * @author mirau on 2021/5/30.
 * @version 1.0
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class Config {

}
