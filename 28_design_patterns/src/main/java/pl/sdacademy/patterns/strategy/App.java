package pl.sdacademy.patterns.strategy;

import pl.sdacademy.patterns.strategy.example.Bill;
import pl.sdacademy.patterns.strategy.example.BillLineItem;
import pl.sdacademy.patterns.strategy.example.Cash;
import pl.sdacademy.patterns.strategy.example.CreditCard;

public class App {

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new BillLineItem("Kielbasa", 200));
        bill.addItem(new BillLineItem("Jogurt", 150));
        bill.addItem(new BillLineItem("Kiełki", 600));

        bill.payTheBill(new CreditCard("John Doe", "2342342345", "345", "20/12/2020"));
    }

}
