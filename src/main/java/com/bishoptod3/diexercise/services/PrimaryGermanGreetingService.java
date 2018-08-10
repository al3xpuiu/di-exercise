package com.bishoptod3.diexercise.services;

/**
 * Created by Loky on 02/08/2018.
 */
//@Service
//@Primary
//@Profile(  "de" )
public class PrimaryGermanGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    //    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
