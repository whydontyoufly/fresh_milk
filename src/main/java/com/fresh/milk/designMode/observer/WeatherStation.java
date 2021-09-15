package com.fresh.milk.designMode.observer;

/**
 * @Description
 * @Author ljg
 * @CreateDate 2021/9/15 11:50
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionDisplay cd = new CurrentConditionDisplay(wd);
        wd.setMeasurements(80,56,30);
    }
}
