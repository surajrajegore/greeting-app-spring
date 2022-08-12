package com.example.greetingappspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppSpringApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Greeting application");
        SpringApplication.run(GreetingAppSpringApplication.class, args);
    }

}
