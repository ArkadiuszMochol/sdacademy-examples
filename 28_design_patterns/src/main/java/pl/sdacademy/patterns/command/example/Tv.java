package pl.sdacademy.patterns.command.example;

import java.util.Arrays;
import java.util.List;

public class Tv {

    private List<String> channels = Arrays.asList("Sport", "Info", "Fun");
    private int currentChannel = 0;

    public void nextChannel() {
        int nextChannel = (currentChannel + 1) % channels.size();
        String channel = channels.get(nextChannel);
        System.out.println("Changing channel to " + channel);
        currentChannel = nextChannel;
    }

    public void previous() {
        int previousChannel = (currentChannel - 1);
        if (previousChannel < 0) {
            previousChannel = channels.size() - 1;
        }
        String channel = channels.get(previousChannel);
        System.out.println("Changing channel to " + channel);
        currentChannel = previousChannel;
    }

}
