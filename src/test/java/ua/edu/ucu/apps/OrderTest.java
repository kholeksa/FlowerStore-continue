package ua.edu.ucu.apps;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testOrderWithPostDeliveryAndCreditCardPayment() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", 10.0));
        items.add(new Item("Item2", 15.0));
        Order order = new Order(items, new CreditCardPaymentStrategy("1234-5678-9012-3456"), new PostDeliveryStrategy());

        assertEquals(25.0, order.calculateTotal(), 0.01);
    }

    @Test
    public void testOrderWithDHLDeliveryAndPayPalPayment() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", 10.0));
        items.add(new Item("Item2", 15.0));
        Order order = new Order(items, new PayPalPaymentStrategy("user@example.com"), new DHLDeliveryStrategy());

        assertEquals(25.0, order.calculateTotal(), 0.01);
    }
}