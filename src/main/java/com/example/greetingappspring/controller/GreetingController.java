package com.example.greetingappspring.controller;

import com.example.greetingappspring.entity.User;
import com.example.greetingappspring.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;


@RestController
    @RequestMapping("/greeting")
    public class GreetingController {
    private static final String TEMPLATE = "Hello,%s";
    private static final AtomicInteger counter = new AtomicInteger();


        @Autowired
        IGreetingService greetingService;
        User user;
            @GetMapping
            public String hello() {
                return "hello";
            }

            @PostMapping("/post")
            private User sayHello(@RequestBody User user) {
                return greetingService.greetingMessage(user);
            }

            @GetMapping("/getmessage")
            public User sayHello(@RequestParam(value = "name",  defaultValue = "Bridgelabz") String name) {
                return new User (user.getId(), String.format(TEMPLATE, user.getFirstName()) ,user.getLastName(),user.message);

            }

    }

