package creation.factory.product;

public class ProductFactory extends Factory {
    @Override
    public Product createProduct(String productType) {
        if (productType.equalsIgnoreCase("electronics")) {
            return new Electronics();
        } else if (productType.equalsIgnoreCase("clothing")) {
            return new Clothing();
        } else if (productType.equalsIgnoreCase("book")) {
            return new Book();
        } else {
            throw new IllegalArgumentException(
                    "Unknown product type."
            );
        }
    }
}