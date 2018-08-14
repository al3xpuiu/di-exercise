package com.bishoptod3.diexercise.config;

import com.bishoptod3.diexercise.examplebeans.FakeDataSource;
import com.bishoptod3.diexercise.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Loky on 13/08/2018.
 */
@Configuration
//@PropertySource( {"classpath:datasource.properties", "classpath:jms.properties"} )
//@PropertySources( {
//        @PropertySource( "classpath:datasource.properties" ),
//        @PropertySource( "classpath:jms.properties" )
//} )
public class PropertyConfig {

//    @Autowired
//    Environment environment;

    @Value( "${example.username}" )
    String username;

    @Value( "${example.password}" )
    String password;

    @Value( "${example.dburl}" )
    String url;

    @Value( "${example.jms.username}" )
    String jmsUsername;

    @Value( "${example.jms.password}" )
    String jmsPassword;

    @Value( "${example.jms.url}" )
    String jmsUrl;

    @Bean
    public FakeDataSource getFakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser( username );
        fakeDataSource.setPassword( password );
        fakeDataSource.setUrl( url );

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker getFakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername( jmsUsername );
        fakeJmsBroker.setPassword( jmsPassword );
        fakeJmsBroker.setUrl( jmsUrl );
        return fakeJmsBroker;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
