package com.shy.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2020/10/27/20:14
 * @Description:
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 要用session中的getAttribute，如果用request的getAttribute，页面跳转，参数是不共享的
        if (request.getSession().getAttribute("user") == null){
            response.sendRedirect("/admin");
            return false;
        }else {
            return true;
        }
    }
}
