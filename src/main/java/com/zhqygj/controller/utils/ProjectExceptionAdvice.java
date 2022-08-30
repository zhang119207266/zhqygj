package com.zhqygj.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: zcy
 * @Date: 2022/8/29 17:01
 * @Description: com.zhqygj.controller.utils
 * @version: 1.0
 */

//作为springMVC 的异常处理器
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {
    // 拦截所有的异常信息
    @ExceptionHandler
    public R  doException(Exception ex){
        //记录日志
        //通知运维
        //通知开发
        ex.printStackTrace();
        return new R ("服务器，故障，请稍后再试！");
    }
}
