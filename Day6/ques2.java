package Day6;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*2: Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result. */
public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter date in(dd-mm-yyyy)format");
        String s=sc.nextLine();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate originaldate=LocalDate.parse(s,dtf);
        LocalDate added=originaldate.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finaldate=added.minusWeeks(3);
        System.out.println("Original Date       : " + originaldate);
        System.out.println("After Additions     : " + added);
        System.out.println("After Subtracting 3 Weeks: " + finaldate);


    }
    
}
