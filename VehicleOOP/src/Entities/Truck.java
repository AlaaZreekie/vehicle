package Entities;

public class Truck extends Vehicle{

    private int access;

    public  int getAccess() {
        return this.access;
    }
    public Truck(String type, String name, int id, double speed, double price, String creationDate, int access) {
        super(type, name, id, speed, price, creationDate);
        this.access = access;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() + "Access: " + this.access + " }";
    }
}
