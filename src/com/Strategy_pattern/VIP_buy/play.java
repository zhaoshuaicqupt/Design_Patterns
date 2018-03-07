package com.Strategy_pattern.VIP_buy;

public class play {
    private double totalAmout=0D;
    private double amount=0D;
    private CalPrice calPrice=new Original();

    //客户只要购买就会增加其总金额
    public void buy(double amount){
        this.amount=amount;
        totalAmout+=amount;
        if(totalAmout>=3000){
            calPrice= new GoldVIP();
        }else if (totalAmout>=2000){
            calPrice=new SuperVIP();
        }else if(totalAmout>=1000){
            calPrice=new VIP();
        }
    }
    public Double calLastAmount(){
        return calPrice.CalPrice(amount);
    }
}



















