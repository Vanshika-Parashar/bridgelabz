package Day3_array;
import java.util.*;
/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 
to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, 
for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the 
array results for each index position in the format Position 1 = 1, …,
 Position 3 = Fizz,...
 * 
 */

public class ques10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        if(number>0){
            String[]arr=new String[number+1];
            int index=0;
            for(int i=1;i<=number;i++){
                if(i%3==0 && i%5==0){
                    arr[index]="FizzBuzz";
                    index++;
                }
                else if(i%3==0){
                    arr[index]="Fizz";
                    index++;
                }
                else if(i%5==0){
                    arr[index]="Buzz";
                    index++;
                }
                else{
                    arr[index]=String.valueOf(i);
                    index++;
                }
                
            }
            for(int i=0;i<index;i++){
                System.out.println("Position " + (i+1) + " = " + arr[i]);
            }
            sc.close();

        }
        else{
            System.out.println("number enterd is not positive");
        }
        }

    
}

