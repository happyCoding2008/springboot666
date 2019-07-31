package com.example.demo.controller;

import com.example.demo.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author huangguizhao
 */
@Controller
@RequestMapping("page")
public class PageController {



    @RequestMapping("hello")
    public String hello(Model model){
        //制作异常
        int i = 1/0;

        //前置知识：视图解析器
        String usernam = "马云";
        model.addAttribute("username",usernam);
        //
        TUser user = new TUser(1L,"java1904","123");
        model.addAttribute("user",user);
        //年收入水平
        model.addAttribute("money",10000);
        //
        List<TUser> users = new ArrayList<>();
        users.add(new TUser(2L,"科比","666"));
        users.add(new TUser(3L,"詹姆斯","666"));

        model.addAttribute("users",users);

        //
        model.addAttribute("now",new Date());

        return "hello";
    }
}
