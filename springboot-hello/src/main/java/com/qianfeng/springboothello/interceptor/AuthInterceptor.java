package com.qianfeng.springboothello.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huangguizhao
 */
@Component
public class AuthInterceptor implements HandlerInterceptor{

    //JDK1.8之前，接口是不能有实现的
    //实现类实现接口，就需要实现所有的方法，或者自己也是抽象的
    //但是通常这个实现类，我们希望不是一个抽象类，又不想所有的方法都要实现
    //适配器的模式

    //JDK1.8之后，直接实现接口即可（接口可以有默认的实现）


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("AuthInterceptor preHandle....");
        return true;
    }
}
