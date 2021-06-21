package com.springframework.pets;

public class CatPetService implements PetService {
    @Override
    public String sayGreeting() {
        return "Cats are the best!";
    }
}
