package com.Strategy_pattern.Duck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i am flying ");
    }
}
