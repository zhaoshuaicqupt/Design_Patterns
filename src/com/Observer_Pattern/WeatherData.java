package com.Observer_Pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers=new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {

        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {

        int i=observers.indexOf(o);
        if(i>=0)
        observers.remove(o);

    }

    @Override
    public void notifyObeservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer)observers.get(i);
            observer.update(temp,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObeservers();
    }
    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
    }
}
