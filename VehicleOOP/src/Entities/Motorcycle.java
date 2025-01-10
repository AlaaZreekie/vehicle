package Entities;

public class Motorcycle extends Vehicle{

    private boolean extraSeat;

    public boolean getExtraSeat() {
        return  this.extraSeat;
    }
    public Motorcycle(String type, String name, int id, double speed, double price, String creationDate, boolean extraSeat) {
        super(type, name, id, speed, price, creationDate);
        this.extraSeat = extraSeat;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() + "ExtraSeat: " + this.extraSeat + " }";
    }
}
