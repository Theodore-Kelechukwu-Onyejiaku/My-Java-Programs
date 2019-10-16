import java.util.Scanner;     //The Scanner class is imported

public class MainClass {
  public static void main(String args[]){
      Scanner input = new Scanner(System.in); // A Scanner object is created
      NameClass announcer = new NameClass();  //An object is created for the NameClass which will perform any method of the class.
        String userName;                      
        System.out.println("Please Enter Your Name");
    userName = input.nextLine();             //userName variable is giving a String value.
    announcer.displayName(userName);         //The userName varible is passed as an argument inside the displayName() method.
      
  }    
}
