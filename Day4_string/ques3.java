package Day4_string;
import java.util.*;
//Count the number of vowels in a string.

public class ques3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='A'||
            ch=='i'||ch=='I'
            ||ch=='E'||ch=='e'||
            ch=='o'||ch=='O'||
            ch=='u'||ch=='U'){
                count+=1;
            }
        }
        System.out.println("no of vowels"+ count);
    }
    
}
