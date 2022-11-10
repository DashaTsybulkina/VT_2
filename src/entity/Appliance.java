package entity;

import java.util.HashMap;
import java.util.Map;

public abstract class Appliance {
    private double price;

    public Appliance(final double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }
}