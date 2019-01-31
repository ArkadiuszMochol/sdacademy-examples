package pl.sdacademy.patterns.facade.example;

public interface AudioSystem {

    enum MusicKind {
        POP, JAZZ, NATURE, HOUSE, DISCO
    }

    void turnOn();
    void turnOff();
    void setVolume(int volume);
    void playMusic(MusicKind musicKind);
}
