package guru.springframework.di_demo.controllers;

import guru.springframework.di_demo.Controllers.SetterINjectedController;
import guru.springframework.di_demo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterINjectedController setterInjectedController;

    @Before
    public void setUp(){
        this.setterInjectedController = new SetterINjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURU,setterInjectedController.sayHello());
    }
}
