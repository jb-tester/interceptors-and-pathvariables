package com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Component
public class MyInterceptor1 extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        request.setAttribute("aaa", "bbb");
        String uri = request.getRequestURI();
        if(uri.contains("pathvar")) {
            String var1 = "0";
            String var2 = "0";
            Map pathVariables = new HashMap();
            
                pathVariables = (Map) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
                
                    var1 = (String) (pathVariables.get("pathVar1") != null ? pathVariables.get("pathVar1") : "0");
                    var2 = (String) (pathVariables.get("pathVar2") != null ? pathVariables.get("pathVar2") : "0");
                
            
            System.out.println("**********************************");
            System.out.println("Path variables passed: pathVar1 = " + var1 + ", pathVar2 = " + var2);
            System.out.println("**********************************");
        }
        return true;
    }  }