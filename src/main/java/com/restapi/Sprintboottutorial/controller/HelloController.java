package com.restapi.Sprintboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Welcome to Spring Boot tutotial by daily buffer and Donny";
    }
}
