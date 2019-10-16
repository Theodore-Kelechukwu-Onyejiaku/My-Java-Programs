/*This is a program for just a basic calculator.
However, the result is going to be a double datatype.
*/
import java.util.Scanner;
public class calculator {
   public static void main(String args[]){
       Scanner calculator = new  Scanner(System.in);
       double fnum,snum,answer;
      do{  System.out.println("You are needed to just enter two numbers");
          System.out.println("Enter first number");
       fnum=calculator.nextDouble();
          System.out.println("Enter second number");
       snum=calculator.nextDouble();
       answer = fnum + snum; 
          System.out.println("answer is: "+answer);}while(1>0);
       
   }    
}
