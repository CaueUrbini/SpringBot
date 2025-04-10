package com.anhembi.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anhembi.spring01.service.HelloWorldService;


@RestController
@RequestMapping("/hello-world")

public class HelloWorldController{

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }
        
    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Caue");
         }
    
        
    
}