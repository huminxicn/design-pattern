package com.observer;

/**
 * 一句话概括功能
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/12 09:08
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, (float) 30.44);
        weatherData.setMeasurements(75, 70, (float) 38.44);
    }
}
