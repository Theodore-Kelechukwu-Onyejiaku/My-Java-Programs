import java.util.Scanner;
public class Inputs {
   public static void main(String args[]){
/*Well this is according to bucky, but the one I have learnt is below this*/
 //Bucky says that the Scanner means we want to use a scanner.
 //The name is a variable that the scanner will store anything entered
 //The System.in stands for the computer input which is just our keyboard
Scanner name=new Scanner(System.in);           //According to bucky, this statement would immediately create a scanner for you to input whatever
           System.out.println(name.nextLine());//This then outputs whatever you have entered regardless of the datatype and the .nextLine means that you should pause till you get inputs   
/*Here is the one I already learnt and think I understand much better than bucky's*/
/*The name above according to what I have learnt is an Object which is a class Scanner
  This object would allow me to take in inputs from my keyboard*/
    String firstName;                     //This is a String variable. 
           System.out.println("This is mine so enter your name");
           firstName=name.nextLine();     //Here I want the object to perform a function to collect in only a String datatype, hence the nextLine().
                                          //And whatever is collected should be the String value of my String variable called firstName
           System.out.println("Your name is "+firstName); //This would print out whatever that has been inputed as the value of my variable.
           }
}