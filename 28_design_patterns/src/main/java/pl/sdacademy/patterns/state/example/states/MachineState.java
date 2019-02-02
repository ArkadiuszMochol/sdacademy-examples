package pl.sdacademy.patterns.state.example.states;

public interface MachineState {
    void insertCoin();
    void returnCoin();
    void pullKnob();
    void giveTheGum();
}
