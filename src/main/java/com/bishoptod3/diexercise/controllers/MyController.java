package com.bishoptod3.diexercise.controllers;

import com.bishoptod3.diexercise.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Loky on 01/08/2018.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        return greetingService.sayGreeting();
    }
}
