package Day4_string;
import java.util.*;
//Find the first non-repeating character in a string.

public class ques6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter string");
        String s=sc.nextLine();
        HashMap<Character,Integer>n=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(n.containsKey(ch)){
                n.put(ch,n.get(ch)+1);
            }
            else{
                n.put(ch,1);
            }
        }
        for(char ch:s.toCharArray()){
            if(n.get(ch)==1){
                System.out.println("first non repeating element is "+ ch);
                break;
            }
        }
    
    
}
}
