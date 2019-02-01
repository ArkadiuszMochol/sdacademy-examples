package pl.sdacademy.patterns.factory.example.factorymethod.pizza;

public class ItalianPepperoniPizza extends Pizza {

    public ItalianPepperoniPizza() {
        name = "Włoska pizza pepperoni";
        dough = "Cienkie ciasto";
        sauce = "Sos z oliwy";
        extraIngredients.add("Tarty ser parmezan");
        extraIngredients.add("Pepperoni");
    }
}
