package com.bishoptod3.diexercise.controllers;

import com.bishoptod3.diexercise.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Loky on 01/08/2018.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImp")
    public GreetingService service;

    public String sayHello() {
        return service.sayGreeting();
    }
}
