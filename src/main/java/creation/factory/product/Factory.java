package creation.factory.product;

public abstract class Factory {
    // Factory Method
    public abstract Product createProduct(String productType);

    public Product orderProduct(String productType) {
        Product product = createProduct(productType);
        product.create();
        return product;
    }
}
