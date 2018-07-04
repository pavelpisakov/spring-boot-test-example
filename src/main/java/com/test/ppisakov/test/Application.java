package com.test.ppisakov.test;

import com.test.ppisakov.test.service.GreetingService;
import com.test.ppisakov.test.service.impl.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean("simple")
    public GreetingService getGreetingService() {
        return new GreetingServiceImpl();
    }

}
