package com.example.greetingappspring.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ServiceLayer {

    public String sayHello(){
        return "Hello world";

    }
}
