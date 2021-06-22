package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.SfgConstructorConfig;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.services.PrototypeBean;
import guru.springframework.sfgdi.services.SingletonBean;
import guru.springframework.sfgdi.config.SfgConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
        System.out.println("_____ Bean Scopes _____ ");
        SingletonBean singletonBean1 = cxt.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = cxt.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());
        PrototypeBean prototypeBean1 = cxt.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = cxt.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());
        System.out.println("__________ Fake Data Source");
        FakeDataSource fakeDataSource = cxt.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcurl());
        System.out.println("__________ Config Props Bean");
        SfgConfiguration sfgConfiguration = cxt.getBean(SfgConfiguration.class);
        System.out.println(sfgConfiguration.getUsername());
        System.out.println(sfgConfiguration.getPassword());
        System.out.println(sfgConfiguration.getJdbcurl());
        System.out.println("__________ Constructor Binding");
        SfgConstructorConfig sfgConstructorConfig = cxt.getBean(SfgConstructorConfig.class);
        System.out.println(sfgConstructorConfig.getUsername());
        System.out.println(sfgConstructorConfig.getPassword());
        System.out.println(sfgConstructorConfig.getJdbcurl());
    }
}
