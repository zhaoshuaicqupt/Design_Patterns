package com.Strategy_pattern.Duck;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i 'm flying with rocket");
    }
}
