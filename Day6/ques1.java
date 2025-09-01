package Day6;
import java.util.*;
import java.time.ZonedDateTime;
import java.time.ZoneId;
//1: Time Zones and ZonedDateTime Write a program that displays the current
public class ques1 {
    public static void main(String[] args) {
        ZonedDateTime gmt= ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst =ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("GreenWich Mean Time:" + gmt);
        System.out.println("Indian Standard Time:" + ist);
        System.out.println("Pacific Standard Time:" + pst);






        
    }
    
}
