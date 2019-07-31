package com.example.demo.entity;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class TUser {
    private Long id;

    @NotBlank(message = "用户名不能为空")
    private String username;

    @Min(6)
    private String password;

    public TUser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public TUser() {
    }


}