package Behavior.memento.game;

public class Memento {
    private String level;
    private int score;

    public Memento(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public String getLevel() {
        return this.level;
    }

    public int getScore() {
        return this.score;
    }
}
