package pl.sdacademy.patterns.command.example;

public class GateCommand implements Command {

    private Gate gate;

    public GateCommand(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void execute() {
        gate.open();
    }

    @Override
    public void undo() {
        gate.close();
    }
}
