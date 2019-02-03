package pl.sdacademy.patterns.observer.example;

public class SmartPhone implements Subscriber {

    @Override
    public void notify(String data) {
        //jeśli temperatura < 0, wyświetl alert "Idzie zima!"
        String valueStr = data.split(" ")[0];
        int degrees = Integer.parseInt(valueStr);
        if (degrees < 0) {
            System.out.println("Idzie zima!");
        }
    }
}
