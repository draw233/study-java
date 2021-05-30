package com.mirai.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author mirau on 2021/5/30.
 * @version 1.0
 */
@WebServlet(name = "HelloServletByAnnotation",urlPatterns = "helloAnnotation")
public class HelloServletByAnnotation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().print("HelloServletByAnnotation");
    }
}

