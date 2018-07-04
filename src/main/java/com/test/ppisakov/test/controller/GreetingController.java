package com.test.ppisakov.test.controller;

import com.test.ppisakov.test.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @RequestMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required = false, defaultValue = "world") String name,
            Model model) {
        model.addAttribute("name", service.greet());
        return "greeting";
    }
}
