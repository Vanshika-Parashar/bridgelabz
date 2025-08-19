package assignment2;
import java.util.*;
//Create a class Car with instance variables model and year. Create two car objects and display their details

class Car {
        String model;
        int year;
}
public class Main {
    public static void main(String[] args) {
        // Create first car object
        Car car1 = new Car();
        car1.model = "Toyota Camry";
        car1.year = 2020;

        // Create second car object
        Car car2 = new Car();
        car2.model = "Honda Accord";
        car2.year = 2021;

        // Display details of the first car
        System.out.println("Car 1 Model: " + car1.model + ", Year: " + car1.year);
        
        // Display details of the second car
        System.out.println("Car 2 Model: " + car2.model + ", Year: " + car2.year);
    }
}

        