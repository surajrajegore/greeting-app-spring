package com.example.greetingappspring.controller.service;

import com.example.greetingappspring.entity.NewUser;
import com.example.greetingappspring.entity.User;

public interface IGreetingService {
    User getMessage();

    User greetingMessage(NewUser newUser);
}
