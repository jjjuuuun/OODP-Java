package behavior.visitor.shape;

class AreaVisitor implements Visitor {
    @Override
    public void visit(CircleShape circle) {
        double area
                = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Circle Area: " + area);
    }

    @Override
    public void visit(RectangleShape rectangle) {
        double area
                = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle Area: " + area);
    }
}
