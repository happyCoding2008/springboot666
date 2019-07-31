package com.qianfeng.springboothello.config;

import com.qianfeng.springboothello.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author huangguizhao
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

    @Autowired
    private AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(authInterceptor).addPathPatterns("/**");
    }
}
