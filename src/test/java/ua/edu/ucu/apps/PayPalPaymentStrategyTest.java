package ua.edu.ucu.apps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayPalPaymentStrategyTest {

    @Test
    public void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy("user@example.com");
        double amount = 50.0;
        boolean paymentSuccessful = false;

        try {
            payment.pay(amount);
            paymentSuccessful = true;
        } catch (Exception e) {
        }

        assertEquals(true, paymentSuccessful);
    }
}