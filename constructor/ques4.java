package constructor;
import java.util.*;
//Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
class HostelBooking{
    String guestname;
    String roomtype;
    int nights;
    //deafult constructor
    public HostelBooking(){
        guestname="vansh";
        roomtype="single";
        nights=2;
    }
    //parametrized constructor
    public HostelBooking(String g,String t,int n){
    this.guestname=g;
    this.roomtype=t;
    this.nights=n;
}
//copy constructor
public HostelBooking(HostelBooking para){
    this.guestname=para.guestname;
    this.roomtype=para.roomtype;
    this.nights=para.nights;
}
void display(){
    System.out.println("Guest Name: " + guestname + ", Room Type: " + roomtype + ", Nights: " + nights);
}
}

public class ques4 {
    public static void main(String[] args) {
        HostelBooking h=new HostelBooking();
        h.display();   
        HostelBooking para=new HostelBooking("Vanshika","double",3);
        para.display();
        HostelBooking copy=new HostelBooking(para);
        copy.display();

    }
    
}
