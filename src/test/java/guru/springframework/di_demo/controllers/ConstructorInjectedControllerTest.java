package guru.springframework.di_demo.controllers;

import guru.springframework.di_demo.Controllers.ConstructorInjectedController;
import guru.springframework.di_demo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void GreetingTest() throws Exception{

        Assert.assertEquals("HELLO GURU guys!!!",constructorInjectedController.sayHello());
    }
}
