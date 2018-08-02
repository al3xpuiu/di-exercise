package com.bishoptod3.diexercise.controllers;

import com.bishoptod3.diexercise.services.GreetingServiceImp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Loky on 01/08/2018.
 */
public class ConstructurInjectedControllerTest {

    private ConstructurInjectedController constructurInjectedController;

    @Before
    public void setUp() throws Exception {
        constructurInjectedController = new ConstructurInjectedController( new GreetingServiceImp() );
    }

    @Test
    public void testGreeting() {
        assertEquals( GreetingServiceImp.HELLO, constructurInjectedController.sayHello() );
    }

}