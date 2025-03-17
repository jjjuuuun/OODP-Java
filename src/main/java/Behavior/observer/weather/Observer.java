package Behavior.observer.weather;

import java.math.BigDecimal;

public interface Observer {
    void update(BigDecimal temp, BigDecimal humidity, BigDecimal pressure);
}
