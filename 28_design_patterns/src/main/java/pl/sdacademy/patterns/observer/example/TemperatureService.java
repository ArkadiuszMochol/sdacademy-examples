package pl.sdacademy.patterns.observer.example;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemperatureService implements Observable {

    List<Subscriber> subscribers = Lists.newArrayList();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void simulateTemperatureChange(int temperature) {
        subscribers.forEach(subscriber -> subscriber.notify(String.format("%d C", temperature)));
    }
}
