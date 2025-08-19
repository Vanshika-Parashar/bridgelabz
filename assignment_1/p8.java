package assignment_1;
import java.util.*; 
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base;");
        int base= sc.nextInt();
        System.out.println("enter exponent:");
        int ex=sc.nextInt();
        int ans=(int)Math.pow(base,ex);
        System.out.println("The power of "+base+" to "+ex+" is: "+ans);
        
    }
    
}
