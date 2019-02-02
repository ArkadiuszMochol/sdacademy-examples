package pl.sdacademy.patterns.templatemethod.example;

public class DieselCar extends Car {

    GasStation gasStation;

    public DieselCar(GasStation gasStation) {
        this.gasStation = gasStation;
    }

    @Override
    public void tank() {
        if (shouldTankPremium()) {
            System.out.printf("A niech tam, zatankuję premium!");
        } else {
            System.out.println("Co za zdzierstwo! Tankuję normalnego diesla");
        }
    }

    private boolean shouldTankPremium() {
        float premiumDieselPrice = gasStation.getPremiumDieselPrice();
        float normalDieselPrice = gasStation.getDieselPrice();

        return premiumDieselPrice - normalDieselPrice < 0.3f;
    }
}
