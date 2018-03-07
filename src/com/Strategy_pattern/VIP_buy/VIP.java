package com.Strategy_pattern.VIP_buy;

public class VIP implements CalPrice {
    @Override
    public Double CalPrice(Double OriginalPrice) {
        return OriginalPrice*0.9;
    }
}
