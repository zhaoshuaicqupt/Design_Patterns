package com.Strategy_pattern.VIP_buy;

public class GoldVIP implements CalPrice {
    @Override
    public Double CalPrice(Double OriginalPrice) {
        return OriginalPrice*0.7;
    }
}
