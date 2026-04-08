package se.lexicon;

public class Car {

    private String plateNumber;
    private String model;

    public Car(String plateNumber, String model) {
        this.plateNumber = plateNumber;
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }
}