package pl.sdacademy.patterns.memento.example;

import java.util.Random;

public class Game {

    private GameState state;

    public Game(String name) {
        state = new GameState(0, 100, name, 0);
    }

    public GameMemento save() {
        return new GameMemento(state);
    }

    public void restore(GameMemento gameMemento) {
        state = gameMemento.getState();
    }

    public void advance() {
        Random random = new Random();
        state.setExperience(state.getExperience() + random.nextInt(10));
        state.setLevel(state.getLevel() + 1);
        int hpDiff = random.nextInt(5);
        state.setHp(state.getHp() + (random.nextInt(5) > 3 ? -hpDiff : hpDiff));
    }

    @Override
    public String toString() {
        return "Game{" +
                "state=" + state +
                '}';
    }

    public static class GameState {
        private int level;
        private int hp;
        private String name;
        private int experience;

        public GameState(int level, int hp, String name, int experience) {
            this.level = level;
            this.hp = hp;
            this.name = name;
            this.experience = experience;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        @Override
        public String toString() {
            return "GameState{" +
                    "level=" + level +
                    ", hp=" + hp +
                    ", name='" + name + '\'' +
                    ", experience=" + experience +
                    '}';
        }
    }
}
