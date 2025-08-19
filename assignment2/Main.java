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
//2. Add a static variable numberOfCars in the Car class from Q1 to count how many objects have been created.
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
// class Car {
//          void method(){
//             int localvariable=10;
//             System.out.println("Local variable inside method: " + localvariable);
//          }
// }
// public class Main {
//     public static void main(String[] args) {
//         // Create first car object
//         Car car = new Car();
//         car.method();
        
//         //System.out.println("Local variable outside method: " + localvariable);
//         // This will cause a compilation error because localvariable is not accessible here
//         // Uncommenting the line below will result in an error
    
//     }
//4.Create a class Student with name (String) and marks (int). Use a constructor to initialize values. Create two objects and print their data.
// class Student{
//     String name;
//     int marks;

//     // Constructor to initialize values
//     Student(String name, int marks) {
//         this.name = name;
//         this.marks = marks;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         // Create first student object
//         Student student1 = new Student("Alice", 85);
        
//         // Create second student object
//         Student student2 = new Student("Bob", 90);
        
//         // Print details of the first student
//         System.out.println("Student 1 Name: " + student1.name + ", Marks: " + student1.marks);
        
//         // Print details of the second student
//         System.out.println("Student 2 Name: " + student2.name + ", Marks: " + student2.marks);
//     }
//5.Write a program where you modify a static variable using one object, and access it from another object. Show how it reflects the change.
class Demo{
    static int count=0;
}
public class Main {
    public static void main(String[] args) {
        // Create first object
        Demo obj1 = new Demo();
        obj1.count = 5; // Modify static variable using obj1
        
        // Create second object
        Demo obj2 = new Demo();
        
        // Access static variable from obj2
        System.out.println("Count from obj2: " + obj2.count); // Should print 5, reflecting the change made by obj1
    }

}

        