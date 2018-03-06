package com.Strategy_pattern;

public class MiniDuckSimulator {
    public static void main(String arhs []){
        Duck mallard =new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
