package com.bishoptod3.diexercise.config;

import com.bishoptod3.diexercise.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Loky on 13/08/2018.
 */
@Configuration
@PropertySource( "classpath:datasource.properties" )
public class PropertyConfig {

    @Value( "${example.username}" )
    String username;

    @Value( "${example.password}" )
    String password;

    @Value( "${example.dburl}" )
    String url;

    @Bean
    public FakeDataSource getFakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser( username );
        fakeDataSource.setPassword( password );
        fakeDataSource.setUrl( url );

        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
