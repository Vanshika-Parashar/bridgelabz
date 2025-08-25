package Day3_array;
import java.util.*;
/*Create a program to find the factors of a number taken as user input, store the factors in an 
array, and display the factors
 */

public class ques8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its factors:");
        int number = sc.nextInt();
        if(number>0){
            int[]factors =new int[(number/2)+1];
            int count=0;
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    factors[count]=i;
                    count++;
                }
            }
            for(int i=0;i<count;i++){
                System.out.println("Factor at index " + i + " is " + factors[i]);
            }
        }
        sc.close();
    

        
    } 
}
