package com.company;

public class FlyingPersonClassAdapter extends PersonWithJetpack implements Duck {

    @Override
    public void quack() { yikes(); }

    @Override
    public void fly() {
        for(int i=0; i<3; i++) {
            super.fly();
        }
    }
}

