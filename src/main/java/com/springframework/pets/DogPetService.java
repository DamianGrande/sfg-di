package com.springframework.pets;

public class DogPetService implements PetService {
    @Override
    public String sayGreeting() {
        return "Dogs are the best!";
    }
}
