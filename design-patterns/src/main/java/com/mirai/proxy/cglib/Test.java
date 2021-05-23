package com.mirai.proxy.cglib;

import com.mirai.proxy.Connection;
import com.mirai.proxy.DirectionConnection;

/**
 * @author mirau on 2021/5/23.
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Connection connection = (Connection) CglibProxy.newInstance(new DirectionConnection());
        connection.connect();

        News news = (News) CglibProxy.newInstance(new News());
        news.showNews();

    }

    static class News {
        public void showNews() {
            System.out.println("展示新闻");
        }
    }

}
