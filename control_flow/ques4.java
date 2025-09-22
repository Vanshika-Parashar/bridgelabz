// Write a program to find the side of the square whose parameter you read from user
import java.util.*;
public class ques4 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the length");
        int perimeter=sc.nextInt();
        int ans=perimeter*perimeter*perimeter*perimeter;
        Syetem.out.print("perimeter of square of length" + perimeter + "is" + ans);

    }
    
}
