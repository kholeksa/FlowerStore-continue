package ua.edu.ucu.apps;

import java.util.List;

public class Order {
    private List<Item> items;
    private Payment paymentStrategy;
    private Delivery deliveryStrategy;

    public Order(List<Item> items, Payment paymentStrategy, Delivery deliveryStrategy) {
        this.items = items;
        this.paymentStrategy = paymentStrategy;
        this.deliveryStrategy = deliveryStrategy;
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void processOrder() {
        double total = calculateTotal();
        paymentStrategy.pay(total);
        deliveryStrategy.deliver();
    }
}
