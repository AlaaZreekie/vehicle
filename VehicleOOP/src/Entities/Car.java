package Entities;

public class Car extends Vehicle{

    private int numberOfCar;

    public int getNumberOfCar() {
        return this.numberOfCar;
    }
    public Car(String type, String name, int id, double speed, double price, String creationDate, int numberOfCar) {
        super(type, name, id, speed, price, creationDate);
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() + ", NumberOfDoors: " + this.numberOfCar +  " }";
    }
}
