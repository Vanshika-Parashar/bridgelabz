package constructor;
import java.util.*;
// Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.

class Book{
    String title;
    String author;
    int price;
    //default constructor
     public Book(){
        title="Harry Potter";
        author="J.K.Rowling";
        price=350;
    }
    //parametrized constructor
    public Book(String t,String a,int p){
        title=t;
        author=a;
        price=p;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
   
}
//

public class ques1 {
    public static void main(String[] args) {
    Book b=new Book();
    b.display();
    Book paramBook=new Book("deathly hallows","J.K.Rowling",500);
    paramBook.display();
        
    }
    
}
