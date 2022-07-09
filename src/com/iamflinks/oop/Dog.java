package com.iamflinks.oop;

// Inheritance
public class Dog extends Animal {
    public Dog(String name, String color, int legs, boolean hasTail) {
        super(name, color, legs, hasTail);
    }
    public void bark () {
        System.out.println("Barking!!!");
    }

    // polymorphism
    public void bark(String name){
        System.out.println(name + " is Barking!!!");
    }
    @Override
    public void eat(String food) {
        super.eat(food);
    }
}
