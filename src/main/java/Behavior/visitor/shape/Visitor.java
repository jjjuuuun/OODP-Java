package Behavior.visitor.shape;

interface Visitor {
    void visit(CircleShape circle);
    void visit(RectangleShape rectangle);
}
