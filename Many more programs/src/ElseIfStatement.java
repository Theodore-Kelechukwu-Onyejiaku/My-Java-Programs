/*
This is a program to test else if statement
*/

//using else if statement you create more than one alternative or optionsor conditions
public class ElseIfStatement {                
  public static void main(String args[]){
      int age = 25;
      if(age <=12){
          System.out.println("You are just 12 years old");
      }
      else if (age<=20){
          System.out.println("You are probably 20 years old");
      }
      else if (age <= 30){
          System.out.println("You are probably 30 years old");
      }
      else{
         System.out.println("Actually, I do not know your age"); 
      }
  }    
}
