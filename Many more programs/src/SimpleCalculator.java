import java.util.Scanner;
public class SimpleCalculator {  
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int firstNumber,secondNumber,sum;
      System.out.println("This is a program that adds two numbers");
      System.out.println("Please enter the first number");
      firstNumber = input.nextInt();
      System.out.println("Please enter the second number");
      secondNumber = input.nextInt();
      sum = firstNumber +  secondNumber;
      System.out.println("The sum of the number is :"+sum);
      
  }    
}
