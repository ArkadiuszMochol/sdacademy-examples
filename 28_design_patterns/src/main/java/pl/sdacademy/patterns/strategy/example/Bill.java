package pl.sdacademy.patterns.strategy.example;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class Bill {

    private List<BillLineItem> billLineItems = Lists.newArrayList();

    public void addItem(BillLineItem item) {
        billLineItems.add(item);
    }

    public void  payTheBill(PaymentMethod paymentMethod) {
        System.out.println("Paying for: " + String.join(
                billLineItems.stream().map(BillLineItem::getName)
                .collect(Collectors.joining())
        ));
        int cost = billLineItems.stream()
                .collect(Collectors.summingInt(BillLineItem::getPrice));
        paymentMethod.pay(cost);
    }

}
