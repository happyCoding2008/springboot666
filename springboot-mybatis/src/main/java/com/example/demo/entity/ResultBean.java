package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author huangguizhao
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String responseCod;
    private T data;
}
