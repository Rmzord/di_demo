package guru.springframework.di_demo;

import guru.springframework.di_demo.Controllers.ConstructorInjectedController;
import guru.springframework.di_demo.Controllers.MyController;
import guru.springframework.di_demo.Controllers.PropertyInjectedController;
import guru.springframework.di_demo.Controllers.SetterINjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

       ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean( "myController");
        System.out.println(controller.hello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterINjectedController.class).sayHello());
    }
}
