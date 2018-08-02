package com.bishoptod3.diexercise.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Loky on 01/08/2018.
 */
@Service
@Primary
@Profile( "es" )
public class PrimarySpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
