package Day3;
import java.util.*;
/*Create a program to print a multiplication table of a number. */

public class ques3 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number you want to print table of");
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number + " * " + i +" = " + (number*i));
        }
        sc.close();

    }
    
}
