package ua.edu.ucu.apps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicSystemTest {

    @Test
    public void testCalculateTotal() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", 10.0));
        items.add(new Item("Item2", 15.0));
        Order order = new Order(items, new CreditCardPaymentStrategy("1234-5678-9012-3456"), new PostDeliveryStrategy());

        assertEquals(25.0, order.calculateTotal(), 0.01);
    }

    @Test
    public void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy("1234-5678-9012-3456");
        double amount = 50.0;
        boolean paymentSuccessful = false;

        try {
            payment.pay(amount);
            paymentSuccessful = true;
        } catch (Exception e) {
        }

        assertEquals(true, paymentSuccessful);
    }

    @Test
    public void testPostDelivery() {
        Delivery delivery = new PostDeliveryStrategy();
        boolean deliverySuccessful = false;

        try {
            delivery.deliver();
            deliverySuccessful = true;
        } catch (Exception e) {
        }

        assertEquals(true, deliverySuccessful);
    }
}
