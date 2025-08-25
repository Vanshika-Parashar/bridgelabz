package Day3_array;
import java.util.*;
/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number
 entered by the user. Finally, print the odd and even numbers array
 */

public class ques7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();
        if(number>=1){
            int[] oddNumbers=new int[(number/2)+1];
            int [] evenNumbers=new int[(number/2)+1];
            int oddcount=0, evencount=0;
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    evenNumbers[evencount]=i;
                    evencount++;
                }
                else{
                    oddNumbers[oddcount]=i;
                    oddcount++;
                }
            }
            for(int i=0;i<oddcount;i++){
                System.out.println("odd number at index " + i + " is " + oddNumbers[i]);
                
            }
            for(int i=0;i<evencount;i++){
                System.out.println("even number at index " + i + " is " + evenNumbers[i]);
                
            }
        

        }
        else{
            System.out.println("not a valid natural number");
        }
        sc.close();
        

}
    

}
