package com.example.greetingappspring.service;

import com.example.greetingappspring.entity.User;

public interface IGreetingService {
    User getMessage();

   User greetingMessage(User user);
}
