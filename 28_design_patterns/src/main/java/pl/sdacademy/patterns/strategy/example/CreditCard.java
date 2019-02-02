package pl.sdacademy.patterns.strategy.example;

public class CreditCard extends Card {

    public CreditCard(String nameOnCard, String number, String cvv, String expirationDate) {
        super(nameOnCard, number, cvv, expirationDate);
    }

    @Override
    protected String getType() {
        return null;
    }

    @Override
    protected void executeTransaction(int cents) {

    }
}
