package com.Strategy_pattern.VIP_buy;

public class client {
    public static void main(String [] args){
        play player=new play();
        player.buy(500D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(1200D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(1200D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(1200D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
    }
}
