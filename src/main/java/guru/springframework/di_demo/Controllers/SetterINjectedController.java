package guru.springframework.di_demo.Controllers;

import guru.springframework.di_demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterINjectedController {

    private GreetingService greetingService;


    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired

    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService){
        this.greetingService=greetingService;
    }
}
