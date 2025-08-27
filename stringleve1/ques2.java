package stringleve1;
import java.util.*;
//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results



public class ques2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
         String s=sc.nextLine();
         int st=0;
         int end=s.length();
         StringBuilder sb=new StringBuilder(); 
         //using charAt
         for(int i=st;i<end;i++){
            sb.append(s.charAt(i));

         }
         String s1=sb.toString();
         if(s.equals(s1)){
            System.out.println("they are equal using charAt");
         }
         //using substring;
         String s2=s.substring(0);
         if(s.equals(s2)){
            System.out.println("they are equal using substring");
         }


    
}
}
