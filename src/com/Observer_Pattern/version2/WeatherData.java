package com.Observer_Pattern.version2;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementChanged(){

        setChanged();
        notifyObservers();

    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}
