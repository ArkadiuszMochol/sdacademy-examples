package pl.sdacademy.patterns.command.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Pilot {

    Map<Integer, Command> buttonToCommandMap = new HashMap<>();
    Map<Integer, Boolean> buttonToModeMap = new HashMap<>();

    public void defineNewCommand(int buttonNumber, Command command) {
        buttonToCommandMap.put(buttonNumber, command);
        buttonToModeMap.put(buttonNumber, false);
    }

    public void push(int buttonNumber) {
        Optional.of(buttonNumber)
                .map(number -> buttonToCommandMap.get(number))
                .ifPresent(Command::execute);

    }

}
