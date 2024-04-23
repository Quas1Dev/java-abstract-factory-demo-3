package com.mycompany.abstractfactorydemo3.factory;

import com.mycompany.abstractfactorydemo3.animal.Dog;
import com.mycompany.abstractfactorydemo3.animal.PetDog;
import com.mycompany.abstractfactorydemo3.animal.PetTiger;
import com.mycompany.abstractfactorydemo3.animal.Tiger;

public class PetAnimalFactory extends AnimalFactory {

    public PetAnimalFactory() {
        System.out.println("You opt for a pet animal.");
    }

    @Override
    public Dog createDog(String color) {
        return new PetDog(color);
    }

    @Override
    public Tiger createTiger(String color) {
        return new PetTiger(color);
    }
    
}
