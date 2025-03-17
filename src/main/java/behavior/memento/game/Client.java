package behavior.memento.game;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        Caretaker caretaker = new Caretaker();

        game.set("1", 100);
        caretaker.add(game.save());

        game.set("2", 200);
        caretaker.add(game.save());

        game.set("3", 300);

        game.restore(caretaker.get(1));
        game.restore(caretaker.get(0));
    }
}
