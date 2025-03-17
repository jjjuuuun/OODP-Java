package behavior.specification.product;

public class CategorySpec implements Specification {
    private String category;

    public CategorySpec(String category) {
        this.category = category;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.category().equals(this.category);
    }
}