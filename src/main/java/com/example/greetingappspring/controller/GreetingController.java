package com.example.greetingappspring.controller;

import com.example.greetingappspring.controller.service.GreetingService;
import com.example.greetingappspring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetingController")
public class GreetingController {

    @Autowired
    GreetingService greetingService;
    private static final String TEMPLATE = "Hello,%s";
    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = {"", "/", "/home"}, method = RequestMethod.GET)
    public User greeting(@RequestParam(value = "name", defaultValue = "Bridgelabz") String name) {
        return new User(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    @GetMapping("/get")
    public User sayHello() {
        return greetingService.getMessage();
    }
}
