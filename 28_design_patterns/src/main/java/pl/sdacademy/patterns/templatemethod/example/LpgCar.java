package pl.sdacademy.patterns.templatemethod.example;

public class LpgCar extends Car {

    GasStation gasStation;

    public LpgCar(GasStation gasStation) {
        this.gasStation = gasStation;
    }

    @Override
    public void tank() {
        if (gasStation.isSelfService()) {
            System.out.println("Trzeba ubrudzić rączki i nabić butlę samemu...");
        } else {
            System.out.println("Proszę pana! Nabić do pełna!");
        }
    }
}
