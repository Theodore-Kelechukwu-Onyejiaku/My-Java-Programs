/*
This is a program I created on my own. It is a program to find the power of integer numbers.
*/
import java.util.Scanner;

public class MathPower {
   public static void main(String args[]){
     Scanner input = new Scanner(System.in); 
do{int result = 1;
     int counter=1;
     int powerNumber;
     int number;
             System.out.println("This is a program to find the power of any number");
             System.out.println("Please Enter the number first then followed by the power");
                number = input.nextInt();
                powerNumber = input.nextInt();
      if(powerNumber==0&&number>0){
          result = 1;
          System.out.println("Result is ="+result);
      }
      else if(powerNumber == 1){
          result = number;
          System.out.println("Result is ="+result);
      }
      else if (number==1){
          result = 1;
          System.out.println("Result is ="+result);
      }
      else if(number==0 && powerNumber==0){
          result = 0;
          System.out.println("Result is ="+result);
      }
      else if (number==0&&powerNumber!=0){
          result = 0;
          System.out.println("Result is ="+result);
      }
      //This is the main logic behind this program
      else if(number>0&&powerNumber!=1){            
          for(counter=1;counter<=powerNumber;counter++){//here i set a counter to postincrement till the value of the power number is reached 
              result = result * number;
          }
      System.out.println("Result is ="+result);
      System.out.println();
      System.out.println();
      }
                    }while(1<2);                                
                                                 
   } 
   
}
