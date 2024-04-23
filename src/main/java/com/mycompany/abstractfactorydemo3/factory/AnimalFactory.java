package com.mycompany.abstractfactorydemo3.factory;

import com.mycompany.abstractfactorydemo3.animal.Dog;
import com.mycompany.abstractfactorydemo3.animal.Tiger;

public abstract class AnimalFactory {
    public abstract Dog createDog(String color);
    public abstract Tiger createTiger(String color);
}
