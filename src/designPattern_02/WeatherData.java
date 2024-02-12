package designPattern_02;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Observer Added Successfully");
    }

    @Override
    public void removeObserver(Observer o) {
        var idx = observers.indexOf(o);
        if (idx >= 0) {
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying Observers now...");
        for(int i = 0 ; i< observers.size(); i++) {
            Observer obs = (Observer) observers.get(i);
            obs.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanges() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanges();
    }
}
