package com.qianfeng.springboothello.controller;

import com.qianfeng.springboothello.entity.Resource;
import com.qianfeng.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author huangguizhao
 */
@RestController //默认下面的方法都会有@ResponseBody注解
@RequestMapping("user")
public class UserController {


    /*@Value("${fileServer.path}")
    private String fileServer;

    @Value("${emailServer.path}")
    private String emailServer;*/

    @Autowired
    private Resource resource;


    @GetMapping("properties")
    public String properties(){
        return resource.getImageServer()+":"+resource.getEmailServer();
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello,SpringBoot!!!!!有钱真好！";
    }

    //@RequestMapping(name = "page",method = RequestMethod.GET)
    //设置默认值
    @GetMapping("page")
    public String page(@RequestParam(name = "pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @GetMapping("page/{pageIndex}")
    public String page2(@PathVariable("pageIndex") Integer pageIndex){
        return "pageIndex2:"+pageIndex;
    }


    @PostMapping("add")
    public User add(User user){
        //user.setEntryDate(new Date());
        return user;
    }
    //此处跟之前无差异！

}
