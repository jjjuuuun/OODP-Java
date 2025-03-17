package Behavior.visitor.shape;

class PerimeterVisitor implements Visitor {
    @Override
    public void visit(CircleShape circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Circle Perimeter: " + perimeter);
    }

    @Override
    public void visit(RectangleShape rectangle) {
        double perimeter
                = 2 * (rectangle.getWidth() + rectangle.getHeight());
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}