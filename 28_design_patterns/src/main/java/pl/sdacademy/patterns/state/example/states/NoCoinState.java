package pl.sdacademy.patterns.state.example.states;

import pl.sdacademy.patterns.state.example.BubbleGumMachine;

public class NoCoinState implements MachineState {

    private BubbleGumMachine bubbleGumMachine;

    public NoCoinState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Włożono monetę - można kupować");
        bubbleGumMachine.setCurrentState(new CoinInsertedState(bubbleGumMachine));
    }

    @Override
    public void returnCoin() {
        System.out.println("Nie ma monety - nie mogę więc zwrócić");
    }

    @Override
    public void pullKnob() {
        System.out.println("Nie ma monety - brak reakcji");
    }

    @Override
    public void giveTheGum() {
        System.out.println("Brak monety - nie ma gumy");
    }
}
