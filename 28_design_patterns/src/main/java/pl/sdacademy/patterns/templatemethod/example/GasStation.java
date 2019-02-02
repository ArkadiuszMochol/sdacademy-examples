package pl.sdacademy.patterns.templatemethod.example;

public class GasStation {

    private float dieselPrice;
    private float premiumDieselPrice;
    private boolean selfService;

    public GasStation(float dieselPrice, float premiumDieselPrice, boolean selfService) {
        this.dieselPrice = dieselPrice;
        this.premiumDieselPrice = premiumDieselPrice;
        this.selfService = selfService;
    }

    public float getDieselPrice() {
        return dieselPrice;
    }

    public float getPremiumDieselPrice() {
        return premiumDieselPrice;
    }

    public boolean isSelfService() {
        return selfService;
    }
}
