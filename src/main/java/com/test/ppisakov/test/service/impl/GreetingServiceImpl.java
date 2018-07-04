package com.test.ppisakov.test.service.impl;

import com.test.ppisakov.test.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return "hello world";
    }

    @Override
    public String greet(String name) {
        return "hello " + name;
    }
}
