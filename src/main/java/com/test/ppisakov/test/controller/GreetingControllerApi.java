package com.test.ppisakov.test.controller;

import com.test.ppisakov.test.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingControllerApi {

    private final GreetingService service;

    public GreetingControllerApi(GreetingService service) {
        this.service = service;
    }

    @RequestMapping("/api/greeting")
    public @ResponseBody String greeting() {
        return service.greet();
    }

}
