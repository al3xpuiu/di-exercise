package com.bishoptod3.diexercise.controllers;

import com.bishoptod3.diexercise.services.GreetingService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Loky on 01/08/2018.
 */
@Controller
public class ConstructurInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ConstructurInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
