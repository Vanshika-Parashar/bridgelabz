package Day4_string;
import java.util.*;
//Convert a string to uppercase without using toUpperCase() (ASCII based).

public class ques2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch>='a'|| ch<='z'){
                s.append((char)(ch-32));
            }
            else{
                s.append(ch);
            }
        }
        System.out.println(s);

    }
    
}
