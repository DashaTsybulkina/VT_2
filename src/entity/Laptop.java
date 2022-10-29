package entity;

public class Laptop  extends Appliance{
    private double batteryCapacity;
    private String os;
    private int romMemory;
    private int systemMemory;
    private String cpu;
    private double displayInches;

    public Laptop(String[] args) {
        super(Double.parseDouble(args[0]));
        batteryCapacity = Double.parseDouble(args[1]);
        os = args[2];
        romMemory = Integer.parseInt(args[3]);
        systemMemory = Integer.parseInt(args[4]);
        cpu = args[5];
        displayInches = Double.parseDouble(args[6]);
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRomMemory() {
        return romMemory;
    }

    public void setRomMemory(int romMemory) {
        this.romMemory = romMemory;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", romMemory=" + romMemory +
                ", systemMemory=" + systemMemory +
                ", cpu='" + cpu + '\'' +
                ", displayInches=" + displayInches +
                ", price=" + getPrice() +
                '}';
    }
}
