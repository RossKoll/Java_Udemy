package collection;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        for ( String animal : animals) {
            System.out.println(animal);
        }

        System.out.println(" ------ ");

        for (int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }

        List<Vehicle> vehicles = new LinkedList<Vehicle>();

        Vehicle vehicle = new Vehicle("Toyota", "Camry", 13999, false);
        vehicles.add(new Vehicle("Honda", "Accord", 12999, false));
        vehicles.add(vehicle);vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

        for (Vehicle vehicleToPrint: vehicles) {
            System.out.println(vehicleToPrint.toString());
        }

        System.out.println("------------");

        printElements(vehicles);
        printElements(animals);
    }

    public static void printElements(List elements){
        for (int i = 0; i< elements.size(); i++){
            System.out.println(elements.get(i));
        }
    }
}
