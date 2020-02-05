package com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
/**
 * Complex interceptor for https://youtrack.jetbrains.com/issue/IDEA-232212
 **/
@Component
public class MyInterceptor3 extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        if (uri.contains("complex")) {

            // requestAttribute setting: reference works
            request.setAttribute("reqattr1", "dummy");

            // requestParams getting: no reference
            String ra1 = request.getParameter("reqparam1");
            String ra2 = request.getParameter("reqparam2");

            // pathVariables getting: no references
            Map pathVariables = (Map) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

            String var1 = (String) pathVariables.get("pathvar1");
            String var2 = (String) pathVariables.get("pathvar2");

            System.out.println("**********************************");
            System.out.println("Complex: " + ra1 + " " + ra2 + " " + var1 + " " + var2);
            System.out.println("**********************************");

        }
        return true;
    }
}