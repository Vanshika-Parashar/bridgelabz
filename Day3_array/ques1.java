package Day3_array;
import java.util.*;
/*Write a program to take user input for the age of all 10 students in a class and check whether the 
student can vote depending on his/her age is greater or equal to 18*/

public class ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[]arr=new int[10];
        System.out.println("enter elements");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<10;i++){
            if (arr[i]<18){
                System.out.println("student of age " + arr[i] + " cannot vote");
            }
            else if(arr[i]>=18){
                System.out.println("student of age " + arr[i] + " can vote");
            }
            else{
                System.out.println("invalid age");
            }
        }
        sc.close();
        

    }
    
}
