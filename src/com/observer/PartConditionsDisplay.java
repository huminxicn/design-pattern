package com.observer;

import com.Subject;

/**
 * 展示部分天气数据。(温度和湿度)
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/12 09:01
 */
public class PartConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public PartConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("part conditions:" + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
