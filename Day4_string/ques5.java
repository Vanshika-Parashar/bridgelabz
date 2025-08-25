package Day4_string;
import java.util.*;
//Check if a string is a palindrome.



public class ques5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter string");
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            s1.append(s.charAt(i));

        }
        String s2=s1.toString();
        if(s.equals(s2)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }

    }
    
}
