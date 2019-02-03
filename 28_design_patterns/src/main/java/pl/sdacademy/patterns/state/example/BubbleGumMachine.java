package pl.sdacademy.patterns.state.example;

import pl.sdacademy.patterns.state.example.states.MachineState;
import pl.sdacademy.patterns.state.example.states.NoCoinState;
import pl.sdacademy.patterns.state.example.states.NoGumsState;

public class BubbleGumMachine {

    MachineState currentState;
    int gumsNumber = 0;

    public BubbleGumMachine(int gumsNumber) {
        this.gumsNumber = gumsNumber;
        if (gumsNumber > 0) {
            currentState = new NoCoinState(this);
        } else {
            currentState = new NoGumsState(this);
        }
    }

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
        currentState.giveTheGum();
        if (gumsNumber > 0) {
            System.out.println("BubbleGumMachine: Wypada guma");
            gumsNumber--;
        } else {
            System.out.println("BubbleGumMachine: BŁĄD! Nie ma już gum!");
        }
    }

    public int getGumsNumber() {
        return gumsNumber;
    }
}
