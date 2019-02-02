package pl.sdacademy.patterns.command.example;

public class AudioCommand implements Command {

    private AudioSystem audioSystem;

    public AudioCommand(AudioSystem audioSystem) {
        this.audioSystem = audioSystem;
    }

    @Override
    public void execute() {
        audioSystem.playMusic();
    }

    @Override
    public void undo() {
        audioSystem.pause();
    }
}
