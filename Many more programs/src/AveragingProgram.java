/*
This is a program to find the average of ten numbers
*/
import java.util.Scanner;
public class AveragingProgram {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    
      int total = 0;
      int numbers;
      int average;
      int counter=0;
     
      System.out.println("Please enter ten numbers");
        while(counter<10){
         numbers = input.nextInt();
         total = total + numbers;
         counter++;
        }
     average = total/10;
     System.out.println("The average of your numbers is "+average);
  } 
}
