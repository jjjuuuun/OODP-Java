package behavior.visitor.shape;

interface Visitor {
    void visit(CircleShape circle);
    void visit(RectangleShape rectangle);
}
