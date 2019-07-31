package com.example.demo.controller;

import com.example.demo.entity.ResultBean;
import com.example.demo.entity.TUser;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author huangguizhao
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("getById/{id}")
    public TUser getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

    @PostMapping("add")
    public ResultBean add(@Valid TUser user){

        return new ResultBean("200","ok");
    }

}
