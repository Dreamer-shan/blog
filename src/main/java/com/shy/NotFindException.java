package com.shy;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: shy
 * @Date: 2020/10/27/14:38
 * @Description:
 */
//@ResponseStatus(HttpStatus.NOT_FOUND)注解表示资源找不到的状态码，标识了状态码的时候就不拦截
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFindException extends RuntimeException{
    public NotFindException() {
    }

    public NotFindException(String message) {
        super(message);
    }

    public NotFindException(String message, Throwable cause) {
        super(message, cause);
    }
}
