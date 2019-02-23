package com.huminxi;

import com.huminxi.observer.FullConditionsDisplay;
import com.huminxi.observer.PartConditionsDisplay;
import com.huminxi.observer.WeatherData;

/**
 * 测试类
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/12 09:08
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        PartConditionsDisplay partConditionsDisplay = new PartConditionsDisplay(weatherData);
        FullConditionsDisplay fullConditionsDisplay = new FullConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, (float) 30.44);
        weatherData.setMeasurements(75, 70, (float) 38.44);
    }
}
