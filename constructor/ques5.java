package constructor;
import java.util.*;
//Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
class Book{
    String title;
    String author;
    int price;
    boolean availability;
    //default constructor
    public Book(String t,String a,int p,boolean av){
        this.title=t;
        this.author=a;
        this.price=p;
        this.availability=av;

    }
    void borrow(){
        if(availability){
            availability=false;
            System.out.println("you can borrow the book: " + title);
        }
        else{
            System.out.println("you cannot borror the book: " + title);
        }
    }
    void display(){
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + availability);
    }
}


public class ques5 {
    public static void main(String[] args) {
        Book b=new Book("HarryPotter","J.K.Rowling",500,true);
        b.display();
        b.borrow();
        b.borrow();
        b.display();
        
    }
    
}
