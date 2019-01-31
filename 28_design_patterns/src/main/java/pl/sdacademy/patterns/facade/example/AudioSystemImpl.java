package pl.sdacademy.patterns.facade.example;

public class AudioSystemImpl implements AudioSystem {

    private int volume = 30;

    @Override
    public void turnOn() {
        System.out.println("AudioSytem: turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("AudioSystem: turning off");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("AudioSystem: setting volume to " + volume);
        this.volume = volume;
    }

    @Override
    public void playMusic(MusicKind musicKind) {
        System.out.println("Playing music: " + musicKind.name() + " (volume: " + volume + ")");
    }
}
