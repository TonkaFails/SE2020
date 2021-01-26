package de.ah.sews.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public ModelAndView callWelcome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/welcome.html");
        return modelAndView;
    }
}
