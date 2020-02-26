package com.company;

public class FlyingPersonAdapter implements FlyingPerson {

    FlyingPerson flyingPerson;

    public FlyingPersonAdapter(FlyingPerson flyingPerson) {
        this.flyingPerson = flyingPerson;
    }

    @Override
    public void yikes() {
        this.flyingPerson.yikes();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            this.flyingPerson.fly();
        }
    }
}