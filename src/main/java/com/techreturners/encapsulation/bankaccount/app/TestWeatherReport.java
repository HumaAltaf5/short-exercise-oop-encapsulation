package com.techreturners.encapsulation.bankaccount.app;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;

public class TestWeatherReport {
    public static void main(String[] args) {
        WeatherReporter wr = new WeatherReporter("London", -2);
        System.out.println(wr.reportWeather());
        WeatherReporter wr1 = new WeatherReporter("California", 13);
        System.out.println(wr1.reportWeather());
        WeatherReporter wr2 = new WeatherReporter("Cape Town", 35);
        System.out.println(wr2.reportWeather());
        WeatherReporter wr4 = new WeatherReporter("Switzerland", 6);
        System.out.println(wr4.reportWeather());
    }
}
