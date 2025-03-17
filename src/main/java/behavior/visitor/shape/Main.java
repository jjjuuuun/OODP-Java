package behavior.visitor.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new CircleShape(5);
        Shape rectangle = new RectangleShape(4, 6);

        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        System.out.println("Calculating Area:");
        circle.accept(areaVisitor);
        rectangle.accept(areaVisitor);

        System.out.println("\nCalculating Perimeter:");
        circle.accept(perimeterVisitor);
        rectangle.accept(perimeterVisitor);
    }
}
