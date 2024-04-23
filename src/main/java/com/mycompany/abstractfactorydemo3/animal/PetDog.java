package com.mycompany.abstractfactorydemo3.animal;

public class PetDog implements Dog {

    public PetDog(String color) {
        System.out.println("A pet dog with " + color + " color is created!");
    }
    
    @Override
    public void displayMe() {
        System.out.println("The " + this + " says: I'm a ferous hunter.");
    }
    
    @Override
    public String toString(){
        return "pet dog";
    }
}
