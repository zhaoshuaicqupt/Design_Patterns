package com.Strategy_pattern;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i 'm flying with rocket");
    }
}
