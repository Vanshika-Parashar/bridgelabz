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
// class Demo{
//     static int count=0;
// }
// public class Main {
//     public static void main(String[] args) {
//         // Create first object
//         Demo obj1 = new Demo();
//         obj1.count = 5; // Modify static variable using obj1
        
//         // Create second object
//         Demo obj2 = new Demo();
        
//         // Access static variable from obj2
//         System.out.println("Count from obj2: " + obj2.count); // Should print 5, reflecting the change made by obj1
//     }
//6.Create a class Demo where you declare a local variable with the same name as an instance variable. Use this keyword to differentiate.
// class Demo{
//     int value = 10; // Instance variable

//     void setnum(int value) { 
//         this.value=value;//differ between lcal and instance 
        
//     }
//     void display() {
//         System.out.println("Instance variable value: " + value); // Accessing instance variable
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Demo demo = new Demo();
//         demo.setnum(20); // Setting the instance variable using the method
//         demo.display(); // Displaying the instance variable value
//     }
//7. Create a final variable inside a class. Try changing its value later. What error do you get?
// class Demo{
//      final int m=100;
//     void change(){
        //m = 200; // Uncommenting this line will cause a compilation error
//         System.out.println("Final variable value: " + m);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Demo demo = new Demo();
//         demo.change(); // Displaying the final variable value
        //demo.m = 200; // Uncommenting this line will cause a compilation error: "cannot assign a value to final variable m"
        //The final field Demo.m cannot be assigned . this is the error showing.
//} 
//8.Add a static block in a class to initialize a static variable. Print its value from the main() method.
// class Demo{
//     static int staticVariable;

    // Static block to initialize the static variable
    // static {
    //     staticVariable = 42; // Initializing static variable
    // }

    
// }
// public class Main{
//     public static void main(String[] args) {
        // Accessing the static variable from the Demo class
//         System.out.println("Static Variable Value: " + Demo.staticVariable); // Should print 42
// }
//9.Create a class Account with instance variables: accountHolder, balance. Use default values. Print them without setting any values.
// class Account{
//     String accountholder;
//     double balance;
// }
// public class Main {
//     public static void main(String[] args) {
//         // Create an Account object
//         Account acc = new Account();
        
//         // Print default values of instance variables
//         System.out.println("Account Holder: " + acc.accountholder); // Should print null
//         System.out.println("Balance: " + acc.balance); // Should print 0.0
//     }
// 10. Create a class that uses all three types of variables:
//Instance variable
//Static variable
//Local variable
// class Demo{
//     int instanceVariable=5; // Instance variable
//     static int staticVariable=7; // Static variable

//     void method() {
//         int localVariable = 10; // Local variable
//         System.out.println("Local Variable: " + localVariable);
        
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Demo demo = new Demo();
        
//         // Accessing instance variable
//         System.out.println("Instance Variable: " + demo.instanceVariable);
        
//         // Accessing static variable
//         System.out.println("Static Variable: " + Demo.staticVariable);
        
//         // Calling method to access local variable
//         demo.method();
// }
//11.. Declare a class variable (static) without initialization. Print its default value. Then assign and print again.
// class Demo{
//     static int var;
// } 
// public class Main{
//     public static void main(String[] args){
//         // Print default value of static variable
//         System.out.println("Default value of static variable: " + Demo.var); // Should print 0
        
//         // Assign a value to the static variable
//         Demo.var = 42;
        
//         // Print the updated value of static variable
//         System.out.println("Updated value of static variable: " + Demo.var); // Should print 42
//     }
//12. Write a class User with a final instance variable userId. Initialize it using a constructor.
// class User{
//     final int userId;

//     // Constructor to initialize the final instance variable
//     User(int id) {
//         this.userId = id;
//     }
//13 Create two classes: A and B. Inside A, create a static variable x. In class B, change and print it.
// class A {
//     static int x = 10; // Static variable in class A
// } 
// class B {
//     public static void main(String[] args) {
//         // Print initial value of static variable x from class A
//         System.out.println("Initial value of x in class A: " + A.x);
        
//         // Change the value of static variable x in class A
//         A.x = 20;
        
//         // Print updated value of static variable x from class A
//         System.out.println("Updated value of x in class A: " + A.x);
//     }
//14.Create a method that accepts a parameter with the same name as a class variable. Use this keyword to assign it.
// class Demo {
//     int num;
//     void setNum(int num) {
//         this.num = num;
//     }
// 15. Create a class with multiple methods accessing the same instance variable. Show how changes made in one method affect another.
//  class Demo {
//     int num;
//     void setNum(int num) {
//         this.num = num;
//     }
//     void display() {
//         System.out.println("Current value of num: " + num);
//     }
//     void increment() {
//         num++;
//         System.out.println("Incremented value of num: " + num);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.setNum(10);
//         d.display();
//         d.increment();
//         d.display(); 
//     }
// }
// 16.Write a program to show that local variables must be initialized before use. Comment on what error appears otherwise.

// class Demo {
//     void method() {
//         int x;
//         // System.out.println(x);
//         // The local variable x may not have been initialized
//     }
// }
//17. Create a class with a static final variable (a constant), e.g., PI = 3.14. Try changing it.

// class Demo {
//     static final double PI = 3.14;
//     void show() {
//         PI = 3.14159; // This will cause a compilation error because PI is a final variable and cannot be changed.
//         System.out.println("Value of PI: " + PI);
//     }
// }
//18. Demonstrate variable shadowing using local and instance variables with the same name. Show how to access both.

// class Demo {
//     int num = 100; // instance
//     void show() {
//         int num = 50; // local
//         System.out.println("Local: " + num);
//         System.out.println("Instance: " + this.num);
//     }
// }

//19. Create an instance variable in a class. Create two objects with different values for it. Show that each object keeps its own copy.

class Demo {
    int value;
}
public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.value = 10;
        d2.value = 20;
        System.out.println("d1: " + d1.value + ", d2: " + d2.value);
    }
}







    







        