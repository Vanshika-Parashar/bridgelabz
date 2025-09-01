package Day6;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
/*3: Date Formatting Write a program that:
➢ Displays the current date in three different formats:
■ dd/MM/yyyy
■ yyyy-MM-dd
■ EEE, MMM dd, yyyy */

public class ques3 {
    public static void main(String[] args) {
        LocalTime current=LocalTime.now();
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("format1: " +f1);
        System.out.println("format 2: " + f2);
        System.out.println("format3: " + f3);

        
    }
    
}
