package com.bishoptod3.diexercise.services;

import org.springframework.stereotype.Service;

/**
 * Created by Loky on 01/08/2018.
 */
@Service
public class GreetingServiceImp implements GreetingService {

    public static final String HELLO = "Hello from GreetingServiceImp";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
