package com.mytests.spring.mvc.interceptorsAndPathvariables.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr1", "home_attr1");
        return "home";
    }

}
