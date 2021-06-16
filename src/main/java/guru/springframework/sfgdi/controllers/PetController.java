package guru.springframework.sfgdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;

    @Autowired
    public PetController(@Qualifier("catPetService") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return this.petService.sayGreeting();
    }
}
