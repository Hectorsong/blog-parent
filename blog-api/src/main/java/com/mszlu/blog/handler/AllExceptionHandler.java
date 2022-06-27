package com.mszlu.blog.handler;

import com.mszlu.blog.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//对加了@Controller注解的方法进行拦截处理  AOP的实现
//这里还可以用@RestControllerAdvice
// @RestController       = @Controller       + @ResponseBody
// @RestControllerAdvice = @ControllerAdvice + @ResponseBody
@ControllerAdvice
//@RestControllerAdvice
public class AllExceptionHandler {

    //进行异常处理，处理Exception.class的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody  //返回json数据，如果不加就返回页面了
    public Result doException(Exception exception){
        exception.printStackTrace();
        return Result.fail(-999, "系统异常");
    }
}
