//This is a program to find the average of ten grades

import java.util.Scanner;
public class MyArray {
   public static void main(String args[]){
    Scanner input = new Scanner (System.in);
       int[] A = new int[10];
       int total = 0;
       int counter = 1;
       float average;
       
       System.out.println("Please enter the ten grades");
     for(int arrayindex = 0; arrayindex <10;arrayindex++){ //the for loop is to accept the values for the grades. and the loop would run 10 times
         A[arrayindex] = input.nextInt();
     }
     for(int arrayindex = 0; arrayindex <10;arrayindex++){//the for loop for the total of the grades
         total = total + A[arrayindex];
     }
     average = total / 10;
     System.out.println(total);
     System.out.println(average);
   }    
}
