import Entities.Car;
import Entities.Motorcycle;
import Entities.Truck;
import Entities.Vehicle;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Vehicle[] readVehiclesFromFile() throws IOException {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(""));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            String type = parts[0];
            String name = parts[1];
            int id = Integer.parseInt(parts[2]) ;
            double price = Double.parseDouble(parts[3]);\
            double minSpeed = Double.parseDouble(parts[4]);
            double maxSpeed = Double.parseDouble(parts[5]);
            String year = parts[6];

            switch (type)
            {
                case "Car":
                    int numOfDoor = Integer.parseInt(parts[7]);
                    vehicles.add(new Car(type, name, id, minSpeed, price, year, numOfDoor));
                    break;
                case "Truck":
                    int access = Integer.parseInt(parts[7]);
                    vehicles.add(new Truck(type, name, id, minSpeed, price, year, access));
                    break;
                case "Motorcycle":
                    boolean extraSeat = Boolean.parseBoolean(parts[7]);
                    vehicles.add(new Motorcycle(type, name, id, minSpeed, price, year, extraSeat));
                    break;
            }
        }

        return vehicles.toArray(new Vehicle[]{vehicles.get(0)});
    }

    public static void sortVehicles(Vehicle[] vehicles) {
        Arrays.sort(vehicles);
    }

    public static void writeVehicleToFile(Vehicle[] vehicles) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(""));
        for(Vehicle vehicle : vehicles) {
            writer.write(vehicle.toString());
            writer.newLine();
        }

        writer.close();
    }

}






