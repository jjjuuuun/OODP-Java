package Behavior.specification.product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200, 5),
                new Product("Smartphone", "Electronics", 800, 0),
                new Product("Headphones", "Electronics", 200, 10),
                new Product("Book", "Literature", 20, 50)
        );

        Specification electronicsSpec = new CategorySpec("Electronics");
        Specification inStockSpec = new InStockSpec();
        Specification expensiveSpec = new PriceSpec(500);

        Specification electronicAndInStockSpec
                = new AndSpec(electronicsSpec, inStockSpec);
        Specification electronicOrInStockSpec
                = new OrSpec(electronicsSpec, inStockSpec);
        Specification notExpensiveSpec = new NotSpec(expensiveSpec);

        System.out.println("Electronics in stock:");
        printProducts(filter(products, electronicAndInStockSpec));

        System.out.println("\nElectronics or items in stock:");
        printProducts(filter(products, electronicOrInStockSpec));

        System.out.println("\nNot expensive items:");
        printProducts(filter(products, notExpensiveSpec));
    }

    public static List<Product> filter(
            List<Product> items, Specification spec
    ) {
        return items.stream()
                .filter(spec::isSatisfiedBy)
                .collect(Collectors.toList());
    }

    public static void printProducts(List<Product> products) {
        products.forEach(
                p -> System.out.println(
                        p.name() + " - " + p.category() + " - $"
                                + p.price() + " - Stock: " + p.stock()
                )
        );
    }
}
