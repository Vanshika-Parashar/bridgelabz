//PERIMETER OF RECTANGLE
package assignment_1;
import java.util.*;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter width of rectangle:");
        int width = sc.nextInt();
        int perimeter = 2*(length+width);
        System.out.println("perimeter of rectangle is:"+perimeter);

        
    }
    
}
