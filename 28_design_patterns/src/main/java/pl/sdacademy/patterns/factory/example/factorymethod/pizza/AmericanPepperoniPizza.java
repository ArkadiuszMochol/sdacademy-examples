package pl.sdacademy.patterns.factory.example.factorymethod.pizza;

public class AmericanPepperoniPizza extends Pizza {

    public AmericanPepperoniPizza() {
        name = "Amerykańska pizza pepperoni";
        dough = "Grube ciasto";
        sauce = "Sos barbeque";
        extraIngredients.add("Tarty ser mozarella");
        extraIngredients.add("Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Krojenie na kwadratowe kawałki.");
    }
}
