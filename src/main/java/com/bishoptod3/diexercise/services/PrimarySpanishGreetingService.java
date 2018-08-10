package com.bishoptod3.diexercise.services;

/**
 * Created by Loky on 01/08/2018.
 */
//@Service
//@Primary
//@Profile( "es" )
public class PrimarySpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    //    @Override

    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
