package Day3_array;
import java.util.*;
/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative,
 or zero. Further for positive numbers check if the number is even or odd. Finally compare the first
  and last elements of the array and display if they equal, greater or less
 */

public class ques2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]arr =new int[5];
        System.out.println("enter 5 elemnts");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]>0){
                System.out.print(arr[i] + " is positive and ");
                if(arr[i]%2==0){
                    System.out.println("it is even number ");
                }
                else{
                    System.out.println("it is odd no ");
                }
            }
            else if (arr[i]<0){
                System.out.println(arr[i] + " is negative");
            }
            else{
                System.out.println("no is zero");
            }
    }
    sc.close();
    
}
}
