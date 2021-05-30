package com.mirai.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author mirau on 2021/5/30.
 * @version 1.0
 */
@Slf4j
@WebFilter(filterName = "myFilter", urlPatterns = "/")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("do filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("filter destroy");
    }
}
