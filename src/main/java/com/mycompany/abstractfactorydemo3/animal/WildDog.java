package com.mycompany.abstractfactorydemo3.animal;

public class WildDog implements Dog {

    public WildDog(String color) {
        System.out.println("A wild dog with " + color + " color is created!");
    }

    @Override
    public void displayMe() {
        System.out.println("The " + this + 
                " says: I prefer to stay at home. Bow-Wow");
    }
    
    public String toString(){
        return "wild dog";
    }
    
}
