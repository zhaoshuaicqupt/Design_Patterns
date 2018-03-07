package com.Strategy_pattern.VIP_buy;

public class Original implements CalPrice {
    @Override
    public Double CalPrice(Double OriginalPrice) {
        return OriginalPrice;
    }
}
