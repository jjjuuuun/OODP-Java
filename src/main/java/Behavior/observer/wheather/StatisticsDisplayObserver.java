package Behavior.observer.wheather;

import java.math.BigDecimal;

public class StatisticsDisplayObserver implements Observer{
    @Override
    public void update(BigDecimal temp, BigDecimal humidity, BigDecimal pressure) {
        System.out.println(
                "Avg/Max/Min temp: " + temp + "/" +
                        (temp.add(BigDecimal.valueOf(2))) + "/" +
                        (temp.subtract(BigDecimal.valueOf(2))));
    }
}
