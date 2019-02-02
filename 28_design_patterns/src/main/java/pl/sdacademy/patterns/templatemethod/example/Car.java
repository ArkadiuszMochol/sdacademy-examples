package pl.sdacademy.patterns.templatemethod.example;

public abstract class Car {

    public void tankProcedure() {
        turnOn();
        goToGasStation();
        tank();
        pay();
        returnHome();
    }

    public void turnOn() {
        System.out.println("Włączamy samochód");
    }

    public void goToGasStation() {
        System.out.println("Jedziemy do stacji benzynowej");
    }

    public abstract void tank();

    public void pay() {
        System.out.println("Zapłać za paliwo");
    }

    public void returnHome() {
        System.out.println("Wracamy do domu!");
    }
}
