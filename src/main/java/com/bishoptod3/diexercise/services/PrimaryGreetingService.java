package com.bishoptod3.diexercise.services;

/**
 * Created by Loky on 01/08/2018.
 */
//@Service
//@Primary
//@Profile( {"en", "default"} )
public class PrimaryGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(com.bishoptod3.diexercise.services.GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    //    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
