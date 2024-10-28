package ua.edu.ucu.apps;

class Item {
    private double price;

    public Item(String name, double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}