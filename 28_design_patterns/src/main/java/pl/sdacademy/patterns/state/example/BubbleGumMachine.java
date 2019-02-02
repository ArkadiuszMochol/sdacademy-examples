package pl.sdacademy.patterns.state.example;

import pl.sdacademy.patterns.state.example.states.MachineState;

public class BubbleGumMachine {

    MachineState currentState;
    int gumsNumber = 0;

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void returnCoin() {
        currentState.returnCoin();
    }

    public void pullKnob() {
        currentState.pullKnob();
    }

    public void setCurrentState(MachineState currentState) {
        this.currentState = currentState;
    }

    public void giveTheGum() {
        if (gumsNumber > 0) {
            System.out.println("BubbleGumMachine: Wypada guma");
            gumsNumber--;
        } else {
            System.out.println("BubbleGumMachine: BŁĄD! Nie ma już gum!");
        }
    }
}
