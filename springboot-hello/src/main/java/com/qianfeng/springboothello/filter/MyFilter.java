package com.qianfeng.springboothello.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author huangguizhao
 */
@Component
public class MyFilter implements Filter{

    /*@Autowired
    private IUserService userService;*/

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.err.println("MyFilter init....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.err.println("MyFilter doFilter....");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.err.println("MyFilter destroy....");
    }
}
