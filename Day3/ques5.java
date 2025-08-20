package Day3;
import java.util.*;
/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and 
display the result
 */

public class ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table from 6 to 9:");
        int number = sc.nextInt();
        for(int i=6;i<=9;i++){
            System.out.println(number + " * " + i + " = "+ (number *i));
        }

    
}
}
