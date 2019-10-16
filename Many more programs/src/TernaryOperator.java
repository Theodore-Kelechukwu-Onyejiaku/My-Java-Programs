/*
This is a program to test the ternary operator.
Remember that it has three operands which are : (boolean-expression) ? (expression1) : (expression2);
The boolean expression represents the condition, the ? means to perform only one expression if the condition is true or false.
The first expression is for true value
The second expression is for false value
*/

public class TernaryOperator {
  public static void main(String args[]){
      int age = 50;
        System.out.println((age>19) ? ("You are no more in your teens") : ("You are not yet an adult")); //This is Bucky's example
      
        
        
        //Here I will use my own example
      String amountOfOranges = "#20"; int numberOfOrangesRemaining = 20; int priceOfOrangesBought;
       priceOfOrangesBought = numberOfOrangesRemaining==20 ? numberOfOrangesRemaining * 20 : 0 ;
       
      System.out.println(priceOfOrangesBought);
  }    
}
