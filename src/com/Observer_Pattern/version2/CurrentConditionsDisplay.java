package com.Observer_Pattern.version2;



import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
    }



    @Override
    public void display() {
        System.out.println("current conditions:" +
                temperature+" F degrees and  " +
                humidity+" %humidity");

    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData=(WeatherData)o;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
        }

    }
}
