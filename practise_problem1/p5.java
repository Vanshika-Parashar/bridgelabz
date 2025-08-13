package bridgelabz.practise_problem1;
import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius ");
        double radius = sc.nextInt();
        System.out.println("enter height");
        double height = sc.nextInt();
        double pi = 3.14;
        double volume = pi * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);

    }
    
}
