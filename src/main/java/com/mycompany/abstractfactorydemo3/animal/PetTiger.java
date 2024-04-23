package com.mycompany.abstractfactorydemo3.animal;

public class PetTiger implements Tiger {

    public PetTiger(String color) {
        System.out.println("A pet tiger with " + color + " color is created!");
    }
    
    @Override
    public void aboutMe() {
        System.out.println("The " + this + 
                " says: I'm illigally domesticated!");
    }

    @Override
    public void inviteDog(Dog dog) {
        System.out.println("There is a " + dog + " living with me.");
    }
    
    @Override
    public String toString(){
        return "pet tiger";
    }
}
