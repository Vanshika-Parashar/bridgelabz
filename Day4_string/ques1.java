package Day4_string;
import java.util.*;

public class ques1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1");
        String s1=sc.nextLine();
        System.out.println("enter string2");
        String s2=sc.nextLine();
        //case sensitive
        boolean ans=s1.equals(s2);
        if(ans){
            System.out.println("string is equal");
        }
        else{
            System.out.println("string is nnot equal ");
        }
        //case Insensitive
        boolean ans1=s1.equalsIgnoreCase(s2);
        if(ans1){
            System.out.println("string is equal");
        }
        else{
            System.out.println("string is nnot equal ");
        }

    }
    
}
    

