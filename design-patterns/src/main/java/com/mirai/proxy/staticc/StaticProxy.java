package com.mirai.proxy.staticc;

import com.mirai.proxy.Connection;

/**
 * @author mirau on 2021/5/23.
 * @version 1.0
 */
public class StaticProxy implements Connection {
    private final Connection connection;

    public StaticProxy(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        System.out.println("静态代理开始");
        connection.connect();
        System.out.println("静态代理结束");
    }
}
