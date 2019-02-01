package pl.sdacademy.patterns.factory.example.factorymethod.pizza;

public class AmericanCheesePizza extends Pizza {

    public AmericanCheesePizza() {
        name = "Amerykańska serowa pizza";
        dough = "Grube ciasto";
        sauce = "Sos barbeque";
        extraIngredients.add("Tarty ser mozarella");
    }

    @Override
    public void cut() {
        System.out.println("Krojenie na kwadratowe kawałki.");
    }
}
