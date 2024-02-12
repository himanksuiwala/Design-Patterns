package designPattern_02;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);

        weatherData.setMeasurements(35,55,30);
    }
}
