package pl.sdacademy.patterns.state.example.states;

import pl.sdacademy.patterns.state.example.BubbleGumMachine;

public class NoGumsState implements MachineState{

    BubbleGumMachine bubbleGumMachine;

    public NoGumsState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Brak gum!");
    }

    @Override
    public void returnCoin() {
        System.out.println("Brak gum!");
    }

    @Override
    public void pullKnob() {
        System.out.println("Brak gum!");
    }

    @Override
    public void giveTheGum() {
        System.out.println("Brak gum!");
    }
}
