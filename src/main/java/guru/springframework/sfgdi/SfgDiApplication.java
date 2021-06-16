package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {
    public static void main(String[] args) {
        ApplicationContext cxt = SpringApplication.run(SfgDiApplication.class, args);
        PetController petController = cxt.getBean("petController", PetController.class);
        System.out.println("_____ The Best Pet is _____ ");
        System.out.println(petController.whichPetIsTheBest());
        I18nController i18nController = (I18nController) cxt.getBean("i18nController");
        System.out.println(i18nController.sayHello());
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
