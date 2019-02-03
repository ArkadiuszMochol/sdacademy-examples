package pl.sdacademy.patterns.state.example.states;

import pl.sdacademy.patterns.state.example.BubbleGumMachine;

public class App {

    public static void main(String[] args) {
        BubbleGumMachine machine = new BubbleGumMachine(3);

        machine.insertCoin();
        machine.pullKnob();
        machine.giveTheGum();

        machine.insertCoin();
        machine.pullKnob();
        machine.giveTheGum();

        machine.insertCoin();
        machine.pullKnob();
        machine.giveTheGum();

        machine.insertCoin();
        machine.pullKnob();
        machine.giveTheGum();
    }
}
