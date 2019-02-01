package pl.sdacademy.patterns.factory.example.factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> extraIngredients = new ArrayList<>();

    public void prepare() {
        System.out.println("Przygotowanie: " + name);
        System.out.println("Wyrabianie ciasta: " + dough);
        System.out.println("Dodawanie sosu " + sauce);
        System.out.println("Dodatki: ");
        extraIngredients.forEach(ingredient -> System.out.println("  - " + ingredient));
    }

    public void cook() {
        System.out.println("Pieczenie w wysokiej temperaturze: 10 minut");
    }

    public void cut() {
        System.out.println("Krojenie na 8 kawałków");
    }
}
