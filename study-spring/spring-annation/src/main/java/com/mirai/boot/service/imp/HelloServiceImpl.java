package com.mirai.boot.service.imp;

import com.mirai.boot.service.HelloService;

/**
 * @author mirau on 2021/5/25.
 * @version 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello";
    }
}
