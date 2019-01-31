package pl.sdacademy.patterns.facade.example;

public class GarageDoorImpl implements GarageDoor {
    @Override
    public void open() {
        System.out.println("Garage door: open");
    }

    @Override
    public void close() {
        System.out.println("Garage door: close");
    }
}
