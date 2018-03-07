package com.Strategy_pattern.Duck;

public class FlyNoWay implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
