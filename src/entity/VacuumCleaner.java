package entity;

/**
 * Class that represents real vacuum cleaner with its properties
 */
public class VacuumCleaner extends Appliance{
    private double consumption;
    private String firm;
    private int power;
    private double weight;
    private String filter;

    public VacuumCleaner(String[] args) {
        super(Double.parseDouble(args[0]));
        firm = args[1];
        consumption = Double.parseDouble(args[2]);
        filter = args[3];
        power = Integer.parseInt(args[4]);
        weight = Double.parseDouble(args[5]);
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "сonsumption=" + consumption +
                ", filter='" + filter + '\'' +
                ", firm='" + firm + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                ", price=" + getPrice() +
                '}';
    }
}
