package entity;

public abstract class Appliance {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Appliance(double price) {
        this.price = price;
    }
}