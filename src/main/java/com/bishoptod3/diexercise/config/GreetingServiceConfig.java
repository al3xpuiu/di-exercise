package com.bishoptod3.diexercise.config;

import com.bishoptod3.diexercise.services.GreetingRepository;
import com.bishoptod3.diexercise.services.GreetingService;
import com.bishoptod3.diexercise.services.GreetingsServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by Loky on 10/08/2018.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingsServiceFactory greetingsServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingsServiceFactory( greetingRepository );
    }

    @Bean
    @Primary
    @Profile( {"en", "default"} )
    GreetingService primaryGreetingService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.getGreetingService( "en" );
    }

    @Bean
    @Primary
    @Profile( {"de"} )
    GreetingService primaryGermanGreetingService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.getGreetingService( "de" );
    }

    @Bean
    @Primary
    @Profile( {"es"} )
    GreetingService primarySpanishGreetingService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.getGreetingService( "es" );
    }

}
