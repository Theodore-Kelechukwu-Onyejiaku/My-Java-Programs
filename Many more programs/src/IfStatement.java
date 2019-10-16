/*
This is a program to test the if statement using String values
*/

import java.util.Scanner;
public class IfStatement {
   public static void main(String args[]){
    Scanner collector=new Scanner(System.in); 
       String  myNameOrPassword = "JEGA1234#";
       String  strangerName="JEGA1234#"; 
          
           System.out.println("Please enter your full name in Uppercase, that is the first letter in capital:");
       
       
          if(strangerName==myNameOrPassword){
             System.out.println("Yes you are authorised to use this computer");}
          else{
             System.out.println("You are not authorised to use this computer, you are not 'Theodore'");
          }
       
   }
}
