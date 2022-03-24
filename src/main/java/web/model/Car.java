package web.model;

public class Car {

    private String model;
    private Byte numberOfWheels;
    private Boolean isNew;

    public Car() {
    }

    public Car(String model, Byte numberOfWheels, Boolean isNew) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.isNew = isNew;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Byte getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Byte numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", isNew=" + isNew +
                '}';
    }
}
