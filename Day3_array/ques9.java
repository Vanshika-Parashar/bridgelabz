package Day3_array;
import java.util.*;
/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the
 2D Array into a single dimension array
 */

public class ques9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows for 2d array");
        int rows = sc.nextInt();
        System.out.println("enter number of columns for 2d array");
        int cols = sc.nextInt();
        int[][] arr2d=new int[rows][cols];
        int arr[]=new int[rows*cols];
        int index=0;
        System.out.println("enter elements for 2d array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2d[i][j]=sc.nextInt();
                arr[index]=arr2d[i][j];
                index++;
            }
        }
        System.out.println("2D Array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("1D Array elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();

    
}
}
