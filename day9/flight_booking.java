package day9;
import java.util.*;
/*Flight Reservation SystemMain Question: Find flights that are overbooked.Tables:
Flights(flight_id, source, destination, date, capacity)
Bookings(booking_id, flight_id, passenger_id)
Passengers(passenger_id, name) 
Use Cases:List flights with number of passengers booked
Show flights with zero bookings.*/
class Flights{
    private String flightid;
    private String source;
    private String destination;
    private String date;
    private int capacity;
    public Flights(String fid,String source,String dest,String date,int capacity){
        this.flightid=fid;
        this.source=source;
        this.destination=dest;
        this.date=date;
        this.capacity=capacity;
    }
    public String getfid(){
        return flightid;
    }
    public String getsource(){
        return source;
    }
    public String getdest(){
        return destination;
    }
    public String getdate(){
        return date;
    }
    public int getcapacity(){
        return capacity;
    }
    public String toString(){
        return "Flight ID: "+flightid+" Source: "+source+" Destination: "+destination+" Date: "+date+" Capacity: "+capacity;
    }

}
class Booking{
    private String bookingid;
    private String flightid;
    private String passengerid;
    public Booking(String bid,String fid,String pid){
        this.bookingid=bid;
        this.flightid=fid;
        this.passengerid=pid;
    }
    public String getbookid(){
        return bookingid;
    }
    public String getfid(){
        return flightid;
    }
    public String pid(){
        return passengerid;
    }
    public String tOString(){
        return "bookingid: "+bookingid+"flightif: "+flightid+"passengerid: "+passengerid ;
       }

}
class Passenger{
    private String passengerid;
    private String name;
    public Passenger(String pid,String name){
        this.passengerid=pid;
        this.name=name;
    }
    public String getpid(){
        return passengerid;
    }
    public String getname(){
        return name;
    }
    public String toString(){
        return "passengeid: "+passengerid+"name: "+name;
    }
}
class reservation{
    List<Flights>flight;
    List<Booking>booking;
    List<Passenger>passenger;
    public reservation(){
        flight=new ArrayList<>();
        booking=new ArrayList<>();
        passenger=new ArrayList<>();
    }
    //to add  new flight in list
    public void addf(Flight flight){
        flight.add(flight);
    }
    //to add new passenger in list
    public void addpassenger(Passenger p){
        pasenger.add(p);
    }
    //make booking using the fight id and passenger id 
    public void dobooking(String bid,Flight flight,Passenger p){
        Booking b=new Booking(bid,flight.getfid(),p.getpid());
        booking.add(b);
    }
    //1 list to flights with no passenger booked
    public void listflightwithbooking(){
        for(Flight f:flight){
            System.out.println("flight id: "+flight.getfid()+ "booked: "+flight.booking.size());
        }

    }
    //2.Show flights with zero bookings.
    public void zerobook(){
        for(Flight f:flight){
            if(f.booking.size==0){
                System.out.println("flight id: "+flight.getfid()+"booked: "+flight.booking.size());
            }
        }
    }


}

public class flight_booking {
        
}
