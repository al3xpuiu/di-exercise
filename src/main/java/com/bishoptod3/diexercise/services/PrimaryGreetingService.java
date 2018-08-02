package com.bishoptod3.diexercise.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Loky on 01/08/2018.
 */
@Service
@Primary
@Profile( {"en", "default"} )
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from PrimaryGreetingService";
    }
}
