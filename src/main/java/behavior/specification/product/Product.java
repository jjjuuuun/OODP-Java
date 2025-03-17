package behavior.specification.product;

public record Product(
        String name,
        String category,
        int price,
        int stock
) { }
