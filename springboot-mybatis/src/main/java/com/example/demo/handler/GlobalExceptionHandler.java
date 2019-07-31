package com.example.demo.handler;

import com.example.demo.entity.ResultBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huangguizhao
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResultBean validationErrorHandler(BindException ex) throws JsonProcessingException {
        //1.此处先获取BindingResult
        BindingResult bindingResult = ex.getBindingResult();
        //2.获取错误信息
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        //3.组装异常信息
        Map<String,String> message = new HashMap<>();
        for (FieldError fieldError : fieldErrors) {
            message.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        //4.将map转换为JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(message);
        //5.返回错误信息
        return new ResultBean("400",json);
    }



    /*@ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean<String> handlerException(Exception exception){
        exception.printStackTrace();
        //TODO 把异常信息记录到日志中
        //给客户端回馈信息
        return new ResultBean("404","您的操作有误，请稍后再试！");
    }*/














}
