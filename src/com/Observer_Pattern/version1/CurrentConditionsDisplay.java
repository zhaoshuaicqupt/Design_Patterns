package com.Observer_Pattern.version1;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current Conditions:"+temp
                + "F degrees and "+ humidity+"% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity=humidity;
        this.temp=temp;
        display();

    }
}
