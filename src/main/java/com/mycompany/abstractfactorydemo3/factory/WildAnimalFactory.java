package com.mycompany.abstractfactorydemo3.factory;

import com.mycompany.abstractfactorydemo3.animal.Dog;
import com.mycompany.abstractfactorydemo3.animal.Tiger;
import com.mycompany.abstractfactorydemo3.animal.WildDog;
import com.mycompany.abstractfactorydemo3.animal.WildTiger;

public class WildAnimalFactory extends AnimalFactory {

    public WildAnimalFactory() {
        System.out.println("You opt for a wild animal!");
    }
    
    @Override
    public Dog createDog(String color) {
        return new WildDog(color);
    }

    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }
    
}
