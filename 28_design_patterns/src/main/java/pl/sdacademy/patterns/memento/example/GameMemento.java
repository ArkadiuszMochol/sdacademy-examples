package pl.sdacademy.patterns.memento.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class GameMemento {

    private static final String FILE_PATH = "game_memento.txt";

    private Game.GameState state;

    public GameMemento(Game.GameState state) {
        this.state = state;
    }

    public Game.GameState getState() {
        return state;
    }

    public void saveStateToFile() {
        String stateContent = String.format("%s;%d;%d;%d",
                state.getName(),
                state.getLevel(),
                state.getHp(),
                state.getExperience());
        try {
            saveToFile(stateContent);
        } catch (IOException e) {
            System.out.println("Nie mogłem zapisać stanu do pliku " + FILE_PATH);
        }
    }

    public static GameMemento readStateFromFile() {
        GameMemento gameMemento = null;
        try {
            String stateContent = readFromFile();
            String [] contents = stateContent.split(";");
            String name = contents[0];
            int level = Integer.parseInt(contents[1]);
            int hp = Integer.parseInt(contents[2]);
            int experience = Integer.parseInt(contents[3]);
            Game.GameState state = new Game.GameState(level, hp, name, experience);
            gameMemento = new GameMemento(state);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gameMemento;
    }

    private static void saveToFile(String content) throws IOException {
        Files.write(Paths.get(FILE_PATH), content.getBytes());
    }

    private static String readFromFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get(FILE_PATH)));
    }
}
