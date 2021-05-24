package com.mytests.spring.mvc.interceptorsAndPathvariables.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Complex test for https://youtrack.jetbrains.com/issue/IDEA-232212
 **/
@RestController
@RequestMapping("/test")
public class ComplexController {

    @RequestMapping("/complex/{pathvar1}/{pathvar2}")
    public String testPathVars2(@PathVariable String pathvar1,
                                @PathVariable("pathvar2") String p2,
                                @RequestAttribute("reqattr1") String ra1,
                                @RequestParam String reqparam1,
                                @RequestParam("reqparam2") String reqp2) {

        return "test" + ra1;
    }
}
