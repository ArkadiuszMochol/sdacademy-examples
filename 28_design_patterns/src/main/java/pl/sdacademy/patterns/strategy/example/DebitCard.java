package pl.sdacademy.patterns.strategy.example;

public class DebitCard extends Card {

    public DebitCard(String nameOnCard, String number, String cvv, String expirationDate) {
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
