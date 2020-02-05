package com.mytests.spring.mvc.interceptorsAndPathvariables;

import com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors.MyInterceptor1;
import com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors.MyInterceptor2;
import com.mytests.spring.mvc.interceptorsAndPathvariables.interceptors.MyInterceptor3;
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


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor1);
        registry.addInterceptor(myInterceptor2);
        registry.addInterceptor(myInterceptor3);
    }
}
