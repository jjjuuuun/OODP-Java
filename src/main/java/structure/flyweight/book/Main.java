package structure.flyweight.book;

public class Main {
    public static void main(String[] args) {
        Book book1 = BookFactory.getBook("Effective Java");
        book1.read();

        Book book2 = BookFactory.getBook("Effective Java");
        book2.read();

        Book book3 = BookFactory.getBook("Clean Code");
        book3.read();

        // Check if book1 and book2 are the same object
        System.out.println(
                book1 == book2 ? "Same book for 'Effective Java'."
                        : "Different books for 'Effective Java'."
        );
    }
}