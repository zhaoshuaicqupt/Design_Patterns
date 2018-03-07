package com.Strategy_pattern.Duck;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();

    }    @Override
    public void display() {
        System.out.println("i am a real Mallard Strategy_pattern");

    }
}
