package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SpringhelloController{
    @GetMapping("/name")
    public String gettext(){
        return "Em ra thai /n em ledh le"; 
    }
}