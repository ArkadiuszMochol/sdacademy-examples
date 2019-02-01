package pl.sdacademy.patterns.factory.example.factorymethod.pizza;

public class ItalianCheesePizza extends Pizza {

    public ItalianCheesePizza() {
        name = "Włoska pizza serowa";
        dough = "Cienkie ciasto";
        sauce = "Sos z oliwy";
        extraIngredients.add("Tarty ser parmezan");
    }
}
