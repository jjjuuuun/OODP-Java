package behavior.observer.weather;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();

        CurrentConditionsDisplayObserver currentConditionsDisplayObserver
                = new CurrentConditionsDisplayObserver();
        StatisticsDisplayObserver statisticsDisplayObserve = new StatisticsDisplayObserver();
        ForecastDisplayObserver forecastDisplayObserver = new ForecastDisplayObserver();

        weatherSubject.registerObserver(currentConditionsDisplayObserver);
        weatherSubject.registerObserver(statisticsDisplayObserve);
        weatherSubject.registerObserver(forecastDisplayObserver);

        weatherSubject.setMeasurements(BigDecimal.valueOf(80),
                BigDecimal.valueOf(65),
                BigDecimal.valueOf(30.4));
    }
}
