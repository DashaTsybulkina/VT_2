package entity;

public class TabletPC extends Appliance {
    private double batteryCapacity;
    private double displayInches;
    private int romMemory;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC(String[] args) {
        super(Double.parseDouble(args[0]));
        batteryCapacity = Double.parseDouble(args[1]);
        displayInches = Double.parseDouble(args[2]);
        flashMemoryCapacity = Integer.parseInt(args[3]);
        color = args[4];
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getRomMemory() {
        return romMemory;
    }

    public void setRomMemory(int romMemory) {
        this.romMemory = romMemory;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", romMemory=" + romMemory +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
