package com.bishoptod3.diexercise.services;

import org.springframework.stereotype.Component;

/**
 * Created by Loky on 10/08/2018.
 */
@Component
public class GreetingRepositoryImp implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello from PrimaryGreetingService";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Begrüßungsdienst";
    }
}
