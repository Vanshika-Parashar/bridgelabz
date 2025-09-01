package stringleve1;
import java.util.*;
//Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result


public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int n=s.length();
        char [] ch=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=s.charAt(i);
        }
        boolean ans=true;
        char[] ch1=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch1[i]){
                ans=false;
                break;
            }
        }
        if(ans==true){
            System.out.println("they are equal");
        }
        else{
            System.out.println("they are not equal");
        }
        
        
    }
    
}
