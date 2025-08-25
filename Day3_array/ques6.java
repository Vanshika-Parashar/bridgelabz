package Day3_array;
import java.util.*;
/*Create a program to find the mean height of players present in a football team.
 */

public class ques6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double heights[]=new double[11];
        double totalheight=0;
        System.out.println("Enter the heights of 11 players in cm:");
        for(int i=0;i<11;i++){
            heights[i]=sc.nextDouble();
            totalheight=totalheight+heights[i];

        }
        double ans=totalheight/11;
        System.out.println("The mean height of the players is: " + ans + " cm");
        sc.close();


    
}
}
