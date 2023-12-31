package com.lit.controller;


import com.lit.exception.BusinessException;
import com.lit.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    //处理系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送信息给运维
        //发送邮件给开发人员
        return new Result(ex.getCode(),null,ex.getMessage());
    }
    //处理业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    //处理其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        //记录日志
        //发送信息给运维
        //发送邮件给开发人员
        System.out.println("异常哪里跑");
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后再试!");
    }
}
