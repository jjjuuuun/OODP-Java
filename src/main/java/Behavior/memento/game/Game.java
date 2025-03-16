package Behavior.memento.game;

public class Game {
    private String level;
    private int score;

    public void set(String level, int score){
        this.level = level;
        this.score = score;
        System.out.println(
                "Game state set to - Level: " + level +
                        " | Score: " + score
        );
    }

    public Memento save(){
        return new Memento(this.level, this.score);
    }

    public void restore(Memento memento){
        this.level = memento.getLevel();
        this.score = memento.getScore();
        System.out.println(
                "Game state restored to - Level: " + this.level +
                        " | Score: " + this.score
        );
    }
}
