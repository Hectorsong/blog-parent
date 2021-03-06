package com.mszlu.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

//写返回结果的类和方法
@Data
@AllArgsConstructor
public class Result {
    private boolean success;
    private int code;
    private  String msg;
    private Object data;

    //请求成功的方法
    public static  Result success(Object data){
        return new Result(true,200, "success",data);
    }

    public static Result fail(int code, String msg){
        return new Result(false, code, msg, null);
    }

}
