package entity;

/**
 * Class that represents real tablet with its properties
 */
public class Tablet extends Appliance {

    private double screenSize;
    private int memory;
    private String firm;
    private String color;
    private double battery;

    public Tablet(String[] args) {
        super(Double.parseDouble(args[0]));
        firm = args[1];
        battery = Double.parseDouble(args[2]);
        screenSize = Double.parseDouble(args[3]);
        memory = Integer.parseInt(args[4]);
        color = args[5];
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "firm=" + firm +
                ", battery=" + battery +
                ", screenSize=" + screenSize +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
