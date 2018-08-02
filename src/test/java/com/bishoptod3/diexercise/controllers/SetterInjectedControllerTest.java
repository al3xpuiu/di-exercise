package com.bishoptod3.diexercise.controllers;

import com.bishoptod3.diexercise.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Loky on 01/08/2018.
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService( new GreetingServiceImp() );
    }

    @Test
    public void testGreeting() {
        assertEquals( GreetingServiceImp.HELLO, setterInjectedController.sayHello() );
    }

}