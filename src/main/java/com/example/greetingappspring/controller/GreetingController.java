package com.example.greetingappspring.controller;

import com.example.greetingappspring.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;


@RestController
    @RequestMapping("/greeting")
    public class GreetingController {

        @Autowired
         ServiceLayer serviceLayer;

            @GetMapping
            public String hello() {
                return "hello";
            }

            @GetMapping("/{name}")
            public Greeting hello(@PathVariable(name = "name") String name) {
                return new Greeting("hello " + name);
            }

            public static class Greeting {
                private final String message;

                public Greeting(String message) {
                    this.message = message;
                }

                public String getMessage(){
                    return message;
                }
            }
    }
