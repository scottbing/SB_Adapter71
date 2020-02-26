package com.company;

public class Main {

    // facade / adapter

    public static void main(String[] args) {
	// write your code here
        MallardDuck timmy = new MallardDuck();
        WildTurkey bobby = new WildTurkey();
        PersonWithJetpack joey = new PersonWithJetpack();

        Duck bobbyD = new TurkeyAdapter(bobby);

        Duck bobbina = new TurkeyClassAdapter();

        Duck joeyJP   = new FlyingPersonClassAdapter();



        testDuck(timmy);
        testDuck((bobbyD));
        testDuck(bobbina);
        testDuck(joeyJP);
    }

    public static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
