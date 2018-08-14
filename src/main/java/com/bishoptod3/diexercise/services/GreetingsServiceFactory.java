package com.bishoptod3.diexercise.services;

/**
 * Created by Loky on 10/08/2018.
 */
public class GreetingsServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingsServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService getGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService( greetingRepository );
            case "de":
                return new PrimaryGermanGreetingService( greetingRepository );
            default:
                return new PrimaryGreetingService( greetingRepository );

        }
    }
}
