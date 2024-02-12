package designPattern_02;

public class CurrentWeatherDisplay implements DisplayElement{
    private float temperature;
    private float humidity;
    private final Subject weatherData;

    public CurrentWeatherDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this::Update);
    }

    public void Update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Weather: "+temperature+" C degrees and humidity "+ humidity );
    }
}
