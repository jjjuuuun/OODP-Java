package Behavior.visitor.shape;


class RectangleShape implements Shape {
    double width, height;

    RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
