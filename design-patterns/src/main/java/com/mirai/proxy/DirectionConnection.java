package com.mirai.proxy;

/**
 * @author mirau on 2021/5/23.
 * @version 1.0
 */
public class DirectionConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("连接");
    }
}
