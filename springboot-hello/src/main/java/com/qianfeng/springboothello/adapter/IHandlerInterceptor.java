package com.qianfeng.springboothello.adapter;

/**
 * @author huangguizhao
 */
public interface IHandlerInterceptor {

    public void pre();

    public void post();

    public void other();
}
