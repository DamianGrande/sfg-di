package com.springframework.pets;

import org.springframework.stereotype.Service;

@Service
public class CatPetService implements PetService {
    @Override
    public String sayGreeting() {
        return "Cats are the best!";
    }
}
