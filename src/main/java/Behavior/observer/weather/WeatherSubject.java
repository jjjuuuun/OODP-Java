package Behavior.observer.weather;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private BigDecimal temperature, humidity, pressure;

    public void setMeasurements(
            BigDecimal temperature, BigDecimal humidity, BigDecimal pressure
    ) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
