package com.anhembi.spring01.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
     public String helloWorld(String name){
        return "oi" + name;
     }
}
