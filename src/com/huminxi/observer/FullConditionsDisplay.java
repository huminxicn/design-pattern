package com.huminxi.observer;

import com.huminxi.Subject;

/**
 * 展示全部的天气数据。
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/12 09:10
 */
public class FullConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public FullConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("full conditions: temperature:" + temperature
                + "\t humidity:" + humidity + "\t pressure:" + pressure);
    }
}

