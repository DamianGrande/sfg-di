package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new ConstructorInjectedController(new ConstructorGreetingServiceImp());
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}