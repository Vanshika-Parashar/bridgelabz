package constructor;
import java.util.*;
// Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.

class Circle{
    double radius;
    //default constructor
        public Circle(){
            radius=1.0;
        }
    //parametrized constructor
    public Circle(double r){
        radius=r;
    }
    void display(){
        System.out.println("Radius: " + radius);
    }

}

public class ques2 {
    public static void main(String[] args) {
        Circle r=new Circle();
        r.display();
        Circle para=new Circle(0.6);
        para.display();
    }
    
}
