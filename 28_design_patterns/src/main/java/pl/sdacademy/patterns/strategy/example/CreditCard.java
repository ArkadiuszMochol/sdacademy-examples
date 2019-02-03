package pl.sdacademy.patterns.strategy.example;

public class CreditCard extends Card {

    public CreditCard(String nameOnCard, String number, String cvv, String expirationDate) {
        super(nameOnCard, number, cvv, expirationDate);
    }

    @Override
    protected String getType() {
        return "credit";
    }

    @Override
    protected void executeTransaction(int cents) {
        System.out.println("Obciążanie linii kredytowej użytkownika kwotą " + cents);
    }
}
