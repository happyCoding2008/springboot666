package com.qianfeng.springboothello.config;

import com.qianfeng.springboothello.filter.MyFilter;
import com.qianfeng.springboothello.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangguizhao
 *
 * web.xml
 * spring-mvc.xml
 */
@Configuration
public class WebConfig {

    @Autowired
    private MyFilter myFilter;

    @Autowired
    private MyListener myListener;

    @Bean
    public FilterRegistrationBean initFilterRegisterBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        //此处如果是new出来的filter，那么就不是属于Spring管理的
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.setName("myFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean initListener(){
        ServletListenerRegistrationBean servletListenerRegistrationBean =
                new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(myListener);
        return servletListenerRegistrationBean;
    }
}
