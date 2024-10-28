package ua.edu.ucu.apps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardPaymentStrategyTest {

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
}
