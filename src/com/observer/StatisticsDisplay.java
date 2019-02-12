package com.observer;

/**
 * 一句话概括功能
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/12 09:10
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
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
        System.out.println("This is statistics weather data: temperature:" + temperature
                + "\t humidity:" + humidity + "\t pressure:" + pressure);
    }
}

