package com.test;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author jay.wang
 * @create 2019-07-16-8:59
 **/
@WebFilter("/*")
public class TestFilter  implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //请求
        //javaEE
        filterChain.doFilter(servletRequest,servletResponse);
        //响应


    }

    @Override
    public void destroy() {

    }
}
