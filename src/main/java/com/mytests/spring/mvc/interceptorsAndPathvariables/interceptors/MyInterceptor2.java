package com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class MyInterceptor2 extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        String uri = request.getRequestURI();
        if(uri.contains("reqparams")) {
            String ra1 = (String) (request != null ? request.getParameter("firstAttr") : "0");
            String ra2 = (String) (request != null ? request.getParameter("secondAttr") : "0");
            System.out.println("**********************************");
            System.out.println("Request Parameters passed: firstAttr = " + ra1 + ", secondAttr = " + ra2);
            System.out.println("**********************************");
        }
        return true;
    }  }