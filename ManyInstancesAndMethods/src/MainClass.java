import java.util.Scanner;

public class MainClass {
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      PrivateVariable privateVariableObject = new PrivateVariable();
       
      String temp;
            System.out.println("Please Enter your First Name");
      temp = input.nextLine();
      
      privateVariableObject.setName(temp);  //This takes in temp varible and makes it the same as firstName in the other class.
      privateVariableObject.message();      //This is a method which makes the object return the value of the firstName in a message.
      
      System.out.println(privateVariableObject.spee);//spee unlike ter is a public variable and so can be used outside its class
     
   }    
}
