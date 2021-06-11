package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {
    public static void main(String[] args) {
        ApplicationContext cxt = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) cxt.getBean("myController");
        System.out.println("__________ Primary Bean");
        System.out.println(myController.sayHello());
        System.out.println("__________ Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) cxt.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        SetterInjectedController setterInjectedController = (SetterInjectedController) cxt.getBean("setterInjectedController");
        System.out.println("__________ Setter");
        System.out.println(setterInjectedController.getGreeting());
        System.out.println("__________ Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) cxt.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }
}
