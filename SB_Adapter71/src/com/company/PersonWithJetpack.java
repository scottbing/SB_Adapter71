package com.company;

public class PersonWithJetpack implements FlyingPerson{

    @Override
    public void yikes() {
        System.out.println("Yikes!! Help!!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
