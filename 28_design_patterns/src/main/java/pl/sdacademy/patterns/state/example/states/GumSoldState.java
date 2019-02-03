package pl.sdacademy.patterns.state.example.states;

import pl.sdacademy.patterns.state.example.BubbleGumMachine;

import java.security.Guard;

public class GumSoldState implements MachineState {

    private BubbleGumMachine bubbleGumMachine;

    public GumSoldState(BubbleGumMachine bubbleGumMachine) {
        this.bubbleGumMachine = bubbleGumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Najpierw odbierz gumę");
    }

    @Override
    public void returnCoin() {
        System.out.println("Guma została sprzedana - za późno :(");
    }

    @Override
    public void pullKnob() {
        System.out.println("Drugie pociągnięcie nic nie da - najpierw odbierz gumę");
    }

    @Override
    public void giveTheGum() {
        if (bubbleGumMachine.getGumsNumber() == 0) {
            System.out.println("Brak gum!");
            bubbleGumMachine.setCurrentState(new NoGumsState(bubbleGumMachine));
        }
        System.out.println("Wydano gumę");
        bubbleGumMachine.setCurrentState(new NoCoinState(bubbleGumMachine));
    }
}
