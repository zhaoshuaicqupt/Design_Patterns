package com.Strategy_pattern;

public class FlyNoWay implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
