/*This is a program for logical operators && and ||
*/
import java.util.Scanner;
public class LogicalOperators {
   public static void main(String args[]){
      /*Here we are using ages of 18 for boys and girls on a hypothetical website.
       We are only using the && (AND) operator first.
       */
    Scanner input=new Scanner(System.in);
    int age; int sex;
          System.out.println("Please indicate your sex age");
          System.out.println("MALE ENTER 1");
          System.out.println("FEMALE ENTER 2");
           sex=input.nextInt();
       switch(sex){
           case 1: System.out.println("Hello young man, please enter your age:");
               age=input.nextInt();
               if(age>18&&age>16){           //Remember that the && operator means that the two conditions must be true for positive result, else a negative result.
                  System.out.println("You are welcome, please select your game!");
               }
               else{
                   System.out.println("Please visit the site for teen games!!!");
               }
               break;
           case 2: System.out.println("Hello young woman, please enter your age:");
               age=input.nextInt();
               if(age>18&&age>16){           //Remember that the && operator means that the two conditions must be true or must be met for positive result, else a negative result.
                  System.out.println("You are welcome, please select your game!");
               }
               else{
                   System.out.println("Please visit the site for teen games!!!");
               }
               break;
           default:System.out.println("Wrong input, please enter 1 or 2.");
       }
   /*Now we use the !! operator which is also called the OR operator. And also pipes.*/
   /*Here is an information system that allows pupils of not less than 15, that is either girls or boys, to get into the office*/
     int boy=16,girl=30;
       if(boy>=15||girl>=15){              //Remember that the !! operator means that one of the conditions or both must be met for the result to be positive.
           System.out.println("Enter young ones, what awaits you inside will surprise you!");
       }
       else{
           System.out.println("WARNING!WARNING!Please make sure that the number of girls or boys is up to or more than 15.");
       }
   }   
}
