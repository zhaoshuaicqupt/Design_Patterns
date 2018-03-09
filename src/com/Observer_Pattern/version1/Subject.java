package com.Observer_Pattern.version1;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObeservers();

}
