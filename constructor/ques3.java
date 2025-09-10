package constructor;
import java.util.*;
// Create a Person class with a copy constructor that clones another person's attributes.
class Person{
    String name;
    int age;
    public Person(String n, int a){
        name=n;
        age=a;
    }
    public Person(Person p){
        name=p.name;
        age=p.age;
    }
    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ques3 {
    
    public static void main(String[] args) {
        Person p=new Person("Vanshika",20);
        p.display();
        Person copy=new Person( p);
        copy.display();

    }
}
