/*This is a program that uses the switch statement*/

import java.util.Scanner;
public class SwitchStatement {
   public static void main(String args[]){
       /*This program tells you the things you did as a child depending on the age.*/
       Scanner input = new Scanner(System.in);
       int age;
       do{
            System.out.println("Please enter the age you would like to know about in number only:");
       age=input.nextInt();
              switch(age){
              case 1: System.out.println("You only knew how to cry,eat and sleep");
                break;
              case 2: System.out.println("You began to talk");
                break;
              case 3: System.out.println("You started getting into trouble");
                break;
              case 4: System.out.println("You now walk and run most times");
                break;
              case 5: System.out.println("You are no more a baby! You a now a kid!");
                break;
              default:System.out.println("Not the age for a baby!!!");
                break;      
          }
       }while(1>0);
   }    
}
