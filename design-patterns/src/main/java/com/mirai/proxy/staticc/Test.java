package com.mirai.proxy.staticc;

import com.mirai.proxy.Connection;
import com.mirai.proxy.DirectionConnection;

/**
 * @author mirau on 2021/5/23.
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Connection staticProxy = new StaticProxy(new DirectionConnection());
        staticProxy.connect();
    }
}
