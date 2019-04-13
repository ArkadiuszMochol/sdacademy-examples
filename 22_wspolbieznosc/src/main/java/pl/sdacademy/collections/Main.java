package pl.sdacademy.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        List<String> syncList = Collections.synchronizedList(new LinkedList<String>());
        Set<String> syncSet = Collections.synchronizedSet(new HashSet());

        Map<String, Integer> concMap = new ConcurrentHashMap<>();
        Set<String> concSet = ConcurrentHashMap.newKeySet();

        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.
    }
}
