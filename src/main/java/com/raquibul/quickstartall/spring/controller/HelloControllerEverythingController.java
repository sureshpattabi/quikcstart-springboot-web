package com.raquibul.quickstartall.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloControllerEverythingController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/home")
    public ModelAndView home() {
    	ModelAndView mav = new ModelAndView("index");
        mav.addObject("greetings", "Hi there");
        return mav;
    }

}
