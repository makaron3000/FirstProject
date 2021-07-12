package com.mate.ua;

public class Main {
    public static void main(String[] args) {
        Dog alice = new Dog("Bob", 17,"Alice");
        System.out.println(alice.intrDog());

        Cat marina = new Cat("Foxy", 2, "Marina");
        System.out.println(marina.intrCat());
    }
}
