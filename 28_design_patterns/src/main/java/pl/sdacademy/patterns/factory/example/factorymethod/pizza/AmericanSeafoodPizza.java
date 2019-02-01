package pl.sdacademy.patterns.factory.example.factorymethod.pizza;

public class AmericanSeafoodPizza extends Pizza {

    public AmericanSeafoodPizza() {
        name = "Amerykańska pizza z owocami morza";
        dough = "Grube ciasto";
        sauce = "Sos barbeque";
        extraIngredients.add("Tarty ser mozarella");
        extraIngredients.add("Krewerki");
        extraIngredients.add("Ośmiornice");
    }

    @Override
    public void cut() {
        System.out.println("Krojenie na kwadratowe kawałki.");
    }
}
