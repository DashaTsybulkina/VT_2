package entity;

public class Speakers extends Appliance {
    private double powerConsumption;
    private int speakersNumber;
    private String frequencyRange;
    private double cordLength;

    public Speakers(String[] args) {
        super(Double.parseDouble(args[0]));
        powerConsumption = Double.parseDouble(args[1]);
        speakersNumber = Integer.parseInt(args[2]);
        frequencyRange = args[3];
        cordLength = Double.parseDouble(args[4]);
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getSpeakersNumber() {
        return speakersNumber;
    }

    public void setSpeakersNumber(int speakersNumber) {
        this.speakersNumber = speakersNumber;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", speakersNumber=" + speakersNumber +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                ", price=" + getPrice() +
                '}';
    }
}
