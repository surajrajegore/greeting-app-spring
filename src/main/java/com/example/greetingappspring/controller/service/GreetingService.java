package com.example.greetingappspring.controller.service;

import com.example.greetingappspring.entity.NewUser;
import com.example.greetingappspring.entity.User;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;


@Service
public class GreetingService implements IGreetingService{
        private static final String TEMPLATE = "Hello ,%s !!";
        private static final AtomicLong count = new AtomicLong();

        public User getMessage() {
            return new User(count.incrementAndGet(), String.format(TEMPLATE, "suraj"));
        }

    @Override
    public User greetingMessage(NewUser newUser) {
        return new User (count.incrementAndGet(), String.format(TEMPLATE, newUser.getFirstName()) + newUser.getLastName());
    }
}

