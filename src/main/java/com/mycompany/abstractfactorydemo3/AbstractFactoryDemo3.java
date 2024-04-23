package com.mycompany.abstractfactorydemo3;

import com.mycompany.abstractfactorydemo3.animal.Dog;
import com.mycompany.abstractfactorydemo3.animal.Tiger;
import com.mycompany.abstractfactorydemo3.factory.AnimalFactory;
import com.mycompany.abstractfactorydemo3.factory.PetAnimalFactory;
import com.mycompany.abstractfactorydemo3.factory.WildAnimalFactory;

public class AbstractFactoryDemo3 {
    AnimalFactory factory;

    public AbstractFactoryDemo3(AnimalFactory factory) {
        this.factory = factory;
    }
    
    public AnimalFactory getFactory(){
        return this.factory;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Abstract Factory pattern demo 3 ***");
        
        AnimalFactory wildAnimalFactory;
        
        AbstractFactoryDemo3 afd = 
                new AbstractFactoryDemo3(new WildAnimalFactory());
        
        wildAnimalFactory = afd.getFactory();
        
        System.out.println("");
        
        Dog dog = wildAnimalFactory.createDog("borwn");
        dog.displayMe();
        
        System.out.println("");
        
        Tiger tiger = wildAnimalFactory.createTiger("yellow");
        tiger.aboutMe();
        tiger.inviteDog(dog);
        
        System.out.println("\n********\n");
        
        afd = new AbstractFactoryDemo3(new PetAnimalFactory());
        
        
        AnimalFactory petAnimalFactory;
        
        petAnimalFactory = afd.getFactory();
        
        System.out.println("");
        
        Dog petDog = petAnimalFactory.createDog("yellow");
        petDog.displayMe();
        
        System.out.println("");
        
        Tiger petTiger = petAnimalFactory.createTiger("orange");
        petTiger.aboutMe();
        petTiger.inviteDog(petDog);
    }
}
