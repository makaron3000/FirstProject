package com.mate.ua;

public class Dog extends Animal {


    public Dog(String name, int age, String owner) {
        super(name, age, owner);
    }

    public String intrDog(){
        return "Welcome " + owner + ". This is your dog: " + name + ".His age is " + age + ".";
    }
}
