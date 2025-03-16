package Behavior.memento.document;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> mementoStack = new Stack<>();

    public void push(Memento memento){
        this.mementoStack.push(memento);
    }

    public Memento pop() {
        if (!this.mementoStack.isEmpty()){
            return this.mementoStack.pop();
        }
        return null;
    }
}
