package creation.factory.product;

public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        // Create an electronics product
        Product electronics = factory.orderProduct("electronics");

        // Create a clothing product
        Product clothing = factory.orderProduct("clothing");

        // Create a book product
        Product book = factory.orderProduct("book");
    }
}
