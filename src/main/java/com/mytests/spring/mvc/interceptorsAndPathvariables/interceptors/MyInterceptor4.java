package com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * *
 * <p>Created by Irina.Petrovskaya on 5/24/2021.</p>
 * <p>Project: interceptors-and-pathvariables</p>
 * *
 */
@Component
public class MyInterceptor4 extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("**********************************");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("**********************************");
        return true;
    }
}
