package Day4_string;
import java.util.*;
//Count the number of words in a string (use StringTokenizer).


public class ques7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1");
        String s=sc.nextLine();
        StringTokenizer s1=new StringTokenizer(s);
        int count=s1.countTokens();
        System.out.println("no of words " + count);

        
    }
    
}
