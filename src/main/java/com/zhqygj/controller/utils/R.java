package com.zhqygj.controller.utils;

import lombok.Data;

/**
 * @program: zhqygj
 * @author: zcy
 * @create: 2022-08-29 10:02
 **/
@Data
public class R {
    private Boolean flag;
    private String msg;
    private Object data;

    public R(){}
    public R(Boolean flag){
        this.flag = flag;
    }
    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }
    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
    public R(Boolean flag,Object data,String msg){
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }
    public static R ok() {
        final R r = new R();
        r.setFlag(true);
        return r;
    }
    public static R faile(String msg) {
        final R r = new R();
        r.setFlag(false);
        r.setMsg(msg);
        return r;
    }
}
