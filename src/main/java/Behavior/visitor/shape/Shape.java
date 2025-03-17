package Behavior.visitor.shape;

interface Shape {
    void accept(Visitor visitor);
}