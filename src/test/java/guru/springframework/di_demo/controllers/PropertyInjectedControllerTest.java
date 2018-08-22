package guru.springframework.di_demo.controllers;

import guru.springframework.di_demo.Controllers.PropertyInjectedController;
import guru.springframework.di_demo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURU,propertyInjectedController.sayHello());
    }
}
