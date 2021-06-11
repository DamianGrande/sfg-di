package guru.springframework.sfgdi.services;

public class GreetingServiceImp implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
