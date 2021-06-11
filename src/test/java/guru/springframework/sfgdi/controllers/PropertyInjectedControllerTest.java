package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingService = new PropertyInjectedGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}