package com.bishoptod3.diexercise.controllers;

import com.bishoptod3.diexercise.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Loky on 01/08/2018.
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.service = new GreetingServiceImp();
    }

    @Test
    public void testGreeting() {
        assertEquals( GreetingServiceImp.HELLO, propertyInjectedController.sayHello() );
    }

}