package pl.sdacademy.patterns.command.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Pilot {

    Map<Integer, Command> buttonToCommandMap = new HashMap<>();
    Map<Integer, Boolean> buttonToModeMap = new HashMap<>();

    public void defineNewCommand(int buttonNumber, Command command) {
        buttonToCommandMap.put(buttonNumber, command);
        buttonToModeMap.put(buttonNumber, true);
    }

    public void push(int buttonNumber) {
        if (buttonToCommandMap.containsKey(buttonNumber)) {
            handleButtonPush(buttonNumber);
        }
    }

    private void handleButtonPush(int buttonNumber) {
        boolean shouldExecute = buttonToModeMap.get(buttonNumber);
        Command command = buttonToCommandMap.get(buttonNumber);

        if (shouldExecute) {
            command.execute();
        } else {
            command.undo();
        }
        buttonToModeMap.put(buttonNumber, !shouldExecute);
    }
}
