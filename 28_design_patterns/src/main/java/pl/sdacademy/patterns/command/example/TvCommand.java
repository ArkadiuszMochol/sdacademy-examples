package pl.sdacademy.patterns.command.example;

public class TvCommand implements Command {

    private Tv tv;

    public TvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.nextChannel();
    }

    @Override
    public void undo() {
        tv.previous();
    }
}
