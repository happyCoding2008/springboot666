package com.qianfeng.springboothello.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author huangguizhao
 */
@Component
public class MyListener implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.err.println("MyListener requestDestroyed ");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.err.println("MyListener requestInitialized ");
    }
}
