package com.bishoptod3.diexercise.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Loky on 02/08/2018.
 */
@Service
@Primary
@Profile(  "de" )
public class PrimaryGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Primärer Begrüßungsdienst";
    }
}
