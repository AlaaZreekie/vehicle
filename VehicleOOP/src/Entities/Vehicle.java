package Entities;

public class Vehicle implements Comparable<Vehicle> {
    private String type;
    private String name;
    private int id;
    private double speed;
    private double price;
    private String creationDate;

    public Vehicle(String type, String name, int id, double speed, double price, String creationDate) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.speed = speed;
        this.price = price;
        this.creationDate = creationDate;
    }

    public String getType() {
        return this.Type;
    }

    public String getName() {
        return this.Name;
    }
    public String getCreationDate() {
        return this.creationDate;
    }

    public int getId() {
        return this.id;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "{ Id: " + this.id + ", Type: " + this.Type + ", Name: " + this.Name + ", Price: " + this.price + ", Speed: " + this.speed +
        "CreationDate: " + this.creationDate + " }";
    }

    @Override
    public int compareTo(Vehicle o) {
        return Double.compare(this.price, o.price);
    }
}
