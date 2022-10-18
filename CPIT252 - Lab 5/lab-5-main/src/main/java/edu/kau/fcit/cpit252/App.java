package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Jeddah => 21.543333, 39.172778 


        GeoLocation coordinator = new GeoLocation();
        String city = coordinator.search(21.543333, 39.172778);
        WeatherDBI weatherInfo = new WeatherDBI();
        String weather = weatherInfo.getWeatherInfo(city);
        System.out.println(weather);
    }
}
