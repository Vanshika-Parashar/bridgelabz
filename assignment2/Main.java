package assignment2;
import java.util.*;
//1.Create a class Car with instance variables model and year. Create two car objects and display their details
// class Car {
//         String model;
//         int year;
// }
// public class Main {
//     public static void main(String[] args) {
//         // Create first car object
//         Car car1 = new Car();
//         car1.model = "Toyota Camry";
//         car1.year = 2020;

//         // Create second car object
//         Car car2 = new Car();
//         car2.model = "Honda Accord";
//         car2.year = 2021;

//         // Display details of the first car
//         System.out.println("Car 1 Model: " + car1.model + ", Year: " + car1.year);
        
//         // Display details of the second car
//         System.out.println("Car 2 Model: " + car2.model + ", Year: " + car2.year);
//     }
// 2. Add a static variable numberOfCars in the Car class from Q1 to count how many objects have been created.
// class Car {
//     String model;
//     int year;
//     static int numberofcars=0;
//     Car(){
//         numberofcars++;
//     } 

// }
// public class Main {
//     public static void main(String[] args) {
//         // Create first car object
//         Car car1 = new Car();
//         car1.model = "Toyota Camry";
//         car1.year = 2020;

//         // Create second car object
//         Car car2 = new Car();
//         car2.model = "Honda Accord";
//         car2.year = 2021;

//         // Display details of the first car
//         System.out.println("Car 1 Model: " + car1.model + ", Year: " + car1.year);
        
//         // Display details of the second car
//         System.out.println("Car 2 Model: " + car2.model + ", Year: " + car2.year);
        
//         // Display number of cars created
//         System.out.println("Total number of cars created: " + Car.numberofcars);
//     }
//3. Create a method inside a class that declares a local variable. Try printing it outside the method. What happens?
class Car {
         void method(){
            int localvariable=10;
            System.out.println("Local variable inside method: " + localvariable);
         }
}
public class Main {
    public static void main(String[] args) {
        // Create first car object
        Car car = new Car();
        car.method();
        
        System.out.println("Local variable outside method: " + localvariable);
    
    }
}

        