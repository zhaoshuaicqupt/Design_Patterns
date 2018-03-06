package com.Strategy_pattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i am flying ");
    }
}
