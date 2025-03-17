package Behavior.visitor.shape;

class CircleShape implements Shape {
    double radius;

    CircleShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
