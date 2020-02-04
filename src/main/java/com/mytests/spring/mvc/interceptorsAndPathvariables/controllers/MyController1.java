package com.mytests.spring.mvc.interceptorsAndPathvariables.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController1 {

    @RequestMapping("/reqparams")
    public String testRequestParams(@RequestParam String firstAttr, @RequestParam("secondAttr") String ra2) {
        
        return "test RequestParam-s read in interceptors";
    }
    
    @RequestMapping("/pathvars/{pathVar1}/{pathVar2}")
    public String testPathVars1(@PathVariable String pathVar1, @PathVariable("pathVar2") String p2){
        
        return "test PathVariable-s read in interceptors";
    }
    @RequestMapping("/control/{var3}/{var4}")
    public String testPathVars2(@PathVariable String var3, @PathVariable("var4") String p4, @RequestAttribute("aaa") String aaa, @RequestParam String ppp){

        return "test PathVariable- s not read by interceptors";
    } 
    
}
