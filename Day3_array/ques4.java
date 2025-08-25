package Day3_array;
import java.util.*;
/*Write a program to store multiple values in an array up to a maximum of 10 or until the user 
enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
 */

public class ques4 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[10];
        int total=0;
        int sum=0;
        System.out.println("enter elements");
        while(total<10){
            int num=sc.nextInt();
            if(num<=0){
                break;
            }
            arr[total]=num;
            sum+=num;
            total++;
        }
        for(int i=0;i<total;i++){
            System.out.println("element at index " + i + " is " + arr[i]);
            
        }
        System.out.println("sum of elements are " + sum);
        sc.close();

    
}
}
