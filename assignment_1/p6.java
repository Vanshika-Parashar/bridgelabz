//SIMPLE INTREST
package bridgelabz.practise_problem1;
import java.util.*;

public class p6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle");
        int principle = sc.nextInt();
        System.out.println("enter rate of interest");  
        int rate = sc.nextInt();
        System.out.println("enter time in years");
        int time = sc.nextInt();
        double si=(principle*rate*time)/100.0;
        System.out.println("Simple Interest is: " + si);
        
    }
    
}
