package behavior.specification.product;

public class PriceSpec implements Specification {
    private int maxPrice;

    public PriceSpec(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.price() <= this.maxPrice;
    }
}