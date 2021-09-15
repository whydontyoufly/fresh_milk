package com.fresh.milk.designMode.observer;

import java.util.ArrayList;

/**
 * @Description
 * @Author ljg
 * @CreateDate 2021/9/15 11:33
 */
public class WeatherData implements Subject {
    //保存所有订阅此主题的观察者
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = this.observers.indexOf(observer);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
