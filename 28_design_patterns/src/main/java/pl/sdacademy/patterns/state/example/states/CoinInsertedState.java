package pl.sdacademy.patterns.state.example.states;

import pl.sdacademy.patterns.state.example.BubbleGumMachine;

public class CoinInsertedState implements MachineState{

    private BubbleGumMachine bubbleGumMachine;

    public CoinInsertedState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Nie można włożyć drugiej monety");
    }

    @Override
    public void returnCoin() {
        System.out.println("Zwracam monetę");
        bubbleGumMachine.setCurrentState(new NoCoinState(bubbleGumMachine));
    }

    @Override
    public void pullKnob() {
        System.out.println("Wydaję gumę");
        bubbleGumMachine.setCurrentState(new GumSoldState(bubbleGumMachine));
    }

    @Override
    public void giveTheGum() {
        System.out.println("Poczekaj na gumę");
    }
}
