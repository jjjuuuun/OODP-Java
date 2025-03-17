package Behavior.specification.product;

public class InStockSpec implements Specification {
    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.stock() > 0;
    }
}