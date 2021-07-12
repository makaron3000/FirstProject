package com.mate.ua;

public class Cat extends Animal{

    public Cat(String name, int age, String owner) {
        super(name, age, owner);
    }

    public String intrCat() {
        return "Welcome " + owner + ". This is your cat: " + name + ".His age is " + age + ".";
    }
}
