package de.ah.sews.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String sayHello(){
        return "<h1>Osenmeiers Buchungssystem</h1>" +
                "<a href=\"/guest\">Gäste</a>";
    }
}
