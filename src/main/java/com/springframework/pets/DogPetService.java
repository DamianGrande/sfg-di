package com.springframework.pets;

import org.springframework.stereotype.Service;

@Service
public class DogPetService implements PetService {
    @Override
    public String sayGreeting() {
        return "Dogs are the best!";
    }
}
