package stringleve1;
import java.util.*;
//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method


public class ques1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
         String s=sc.nextLine();
         System.out.println("enter string2");
         String s2=sc.nextLine();
         boolean ans=true;
         if(s.length()!=s2.length()){
            System.out.println("strings not equal");
         }
         else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=(s2.charAt(i))){
                    ans=false;
                    break;
                }
                


            }
         }
         if(ans==true){
            System.out.println("srings are equal");
         }
         else{
            System.out.println("strings are not equal");
         }

    }
    
}
