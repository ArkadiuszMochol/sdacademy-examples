package pl.sdacademy.patterns.memento.example;

public class App {

    public static void main(String[] args) {
        Game game = new Game("Staszek");
        game.advance();
        game.advance();
        System.out.println(game);
        GameMemento memento = game.save();
        memento.saveStateToFile();
        game.advance();
        game.advance();
        System.out.println(game);
        game.restore(GameMemento.readStateFromFile());
        System.out.println(game);
    }

}
