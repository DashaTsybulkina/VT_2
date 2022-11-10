package entity;

/**
 * Class that represents real refrigerator with its properties
 */
public class Refrigerator extends Appliance {
    private String firm;
    private double consumption;
    private double weight;
    private double capacity;
    private double height;
    private double width;

    public Refrigerator(String[] args) {
        super(Double.parseDouble(args[0]));
        firm = args[1];
        consumption = Double.parseDouble(args[2]);
        weight = Double.parseDouble(args[3]);
        capacity = Double.parseDouble(args[4]);
        height = Double.parseDouble(args[5]);
        width = Double.parseDouble(args[6]);
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                " consumption=" + consumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", height=" + height +
                ", width=" + width +
                ", price=" + getPrice() +
                '}';
    }
}
