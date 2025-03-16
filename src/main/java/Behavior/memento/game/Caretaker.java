package Behavior.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        this.mementoList.add(state);
    }

    public Memento get(int index){
        return this.mementoList.get(index);
    }
}
