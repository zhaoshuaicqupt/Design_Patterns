package com.Strategy_pattern.Duck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<silence>");
    }
}
