package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private double newTemp;
    private final int MAXTEMP = 30;
    private final int MINTEMP = 10;



    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
        this.newTemp = (9.0 / 5.0) * temperature + 32;
    }

    public String reportWeather() {

        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, getSymbol(), checkTemp(), newTemp);

    }

    public String getSymbol() {
        if (location.equals("London")) {

            return "🌦";

        } else if (location.equals("California")) {

            return "🌅";

        } else if (location.equals("Cape Town")) {

            return "🌤";

        }
        return "🔆";
    }

    public String checkTemp() {
        if (temperature > MAXTEMP) {

            return "It's too hot 🥵!";

        } else if (temperature < MINTEMP) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }
}
