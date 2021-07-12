package com.mate.ua;

public class Dog {
    String name;
    int age;
    String owner;

    public Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String welcome(){
        return "Welcome " + owner + ". This is your dog: " + name + ".His age is " + age + ".";
    }
}
