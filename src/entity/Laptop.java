package entity;

/**
 * Class that represents real laptop with its properties
 */
public class Laptop  extends Appliance{
    private String firm;
    private String os;
    private double battery;
    private int memory;
    private String CPU_NAME;
    private double screenSize;

    public Laptop(String[] args) {
        super(Double.parseDouble(args[0]));
        firm = args[1];
        os = args[2];
        battery = Double.parseDouble(args[3]);
        memory = Integer.parseInt(args[4]);
        CPU_NAME = args[5];
        screenSize = Double.parseDouble(args[6]);
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getCPU_NAME() {
        return CPU_NAME;
    }

    public void setCPU_NAME(String CPU_NAME) {
        this.CPU_NAME = CPU_NAME;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "firm=" + firm +
                " battery=" + battery +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", CPU name='" + CPU_NAME + '\'' +
                ", screen size=" + screenSize +
                ", price=" + getPrice() +
                '}';
    }
}
