package ua.edu.ucu.apps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DeliveryStrategiesTest {

    @Test
    public void testPostDelivery() {
        Delivery PostDelivery = new PostDeliveryStrategy();
        Delivery DHLDelivery = new DHLDeliveryStrategy();
        boolean PostDeliverySuccessful = false;
        boolean DhlDeliverySuccessful = false;

        try {
            PostDelivery.deliver();
            PostDeliverySuccessful = true;
        } catch (Exception e) {
            PostDeliverySuccessful = false;
        }

        try {
            DHLDelivery.deliver();
            DhlDeliverySuccessful = true;
        } catch (Exception e) {
            DhlDeliverySuccessful = false;
        }

        assertEquals(true, PostDeliverySuccessful);
        assertEquals(true, DhlDeliverySuccessful);
    }
}