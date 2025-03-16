package Behavior.observer.wheather;

import java.math.BigDecimal;

public class ForecastDisplayObserver implements Observer{
    @Override
    public void update(BigDecimal temp, BigDecimal humidity, BigDecimal pressure) {
        int pressureCompare = pressure.compareTo(BigDecimal.valueOf(29.92));
        String forecast = "";

        if (pressureCompare == -1) {forecast = "Rain";}
        else {forecast = "Sunny";}
        System.out.println("Forecast: " + forecast);
    }
}
