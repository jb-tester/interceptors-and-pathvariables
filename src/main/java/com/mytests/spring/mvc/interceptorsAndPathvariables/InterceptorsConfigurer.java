package com.mytests.spring.mvc.interceptorsAndPathvariables;

import com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors.MyInterceptor1;
import com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors.MyInterceptor2;
import com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors.MyInterceptor3;
import com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors.MyInterceptor4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorsConfigurer implements WebMvcConfigurer {


    @Autowired
    private MyInterceptor2 myInterceptor2;
    @Autowired
    private MyInterceptor1 myInterceptor1;
    @Autowired
    private MyInterceptor3 myInterceptor3;
    @Autowired
    private MyInterceptor4 myInterceptor4;

   // no URL path references for paths: https://youtrack.jetbrains.com/issue/IDEA-231794
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor1).addPathPatterns("/test/**");
        registry.addInterceptor(myInterceptor2).addPathPatterns("/test/**");
        registry.addInterceptor(myInterceptor3).addPathPatterns("/test/**");
        registry.addInterceptor(myInterceptor4).excludePathPatterns("/test/control/**");
    }
}
