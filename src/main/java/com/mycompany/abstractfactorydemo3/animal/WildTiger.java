package com.mycompany.abstractfactorydemo3.animal;

public class WildTiger implements Tiger {

    public WildTiger(String color) {
        System.out.println("A wild tiger with " + color + " color is created!");
    }
    
    @Override
    public void aboutMe() {
        System.out.println("The " + this +
                " says: I roam freely in the jungle.");
    }

    @Override
    public void inviteDog(Dog dog) {
        System.out.println("I saw a " + dog +
                " adventuring inside the jungle");
    }
    
    @Override
    public String toString(){
        return "wild tiger";
    }
}
