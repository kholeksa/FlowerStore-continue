package ua.edu.ucu.apps;

class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivered via DHL");
    }
}