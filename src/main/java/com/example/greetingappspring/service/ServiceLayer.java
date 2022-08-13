package com.example.greetingappspring.service;


import com.example.greetingappspring.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ServiceLayer implements IGreetingService{
    private static final String TEMPLATE = "Hello ,%s ";
    public static final AtomicInteger count = new AtomicInteger();
    @Override
    public User getMessage() {

        return new User(count.incrementAndGet(),String.format(TEMPLATE,"suraj "),String.format("rajegore","hii"),"");
    }

    @Override
    public  User greetingMessage(User user) {
        return new User (user.getId(), String.format(TEMPLATE, user.getFirstName()) ,user.getLastName(),user.message);
    }
}
