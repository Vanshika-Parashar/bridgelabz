package Day4_string;
import java.util.*;
//Find the length of a string without using .length().

public class ques4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int l=0;
        for(char ch:s.toCharArray()){
            l++;
        }
        System.out.println("length is " + l);

    
}
}
