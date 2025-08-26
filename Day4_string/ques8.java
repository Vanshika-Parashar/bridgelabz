package Day4_string;
import java.util.*;
//Replace all spaces with hyphens in a string.

public class ques8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                sb.append('-');
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println("String after chnges " + sb.toString());
        


    
}
}
