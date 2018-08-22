package guru.springframework.di_demo.Controllers;


import guru.springframework.di_demo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

        private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        //System.out.println("Hello -------------------- FLORIN ----------------------!");
        return greetingService.sayGreeting();
    }


}
