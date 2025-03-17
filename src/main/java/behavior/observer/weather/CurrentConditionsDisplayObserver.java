package behavior.observer.weather;

import java.math.BigDecimal;

public class CurrentConditionsDisplayObserver implements Observer{
    @Override
    public void update(BigDecimal temp, BigDecimal humidity, BigDecimal pressure) {
        System.out.println(
                "Current: " + temp + "F, " + humidity + "% humidity");
    }
}
