package com.bishoptod3.diexercise.services;

import org.springframework.stereotype.Service;

/**
 * Created by Loky on 01/08/2018.
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from ConstructorGreetingService";
    }
}
