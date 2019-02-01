package pl.sdacademy.patterns.factory.example.factorymethod.pizza;

public class ItalianSeafoodPizza extends Pizza {

    public ItalianSeafoodPizza() {
        name = "Włoska pizza z owocami morza";
        dough = "Cienkie ciasto";
        sauce = "Sos z oliwy";
        extraIngredients.add("Tarty ser parmezan");
        extraIngredients.add("świeże małże");
        extraIngredients.add("Kałamarnice");
    }
}
