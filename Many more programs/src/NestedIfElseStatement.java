/*This is a program to test the nested if else statement*/

//Nested if else statement is all about nesting another if else statement inside the if or else statement
public class NestedIfElseStatement {
  public static void main(String args[]){
      int age = 30;
      //main if else statement
      if(age <30){
          System.out.println("You are young");
          //nested if else one
          if(age <20){
              //nested if else 2
              System.out.println("You are still in your Teens or maybe much younger");
              if(age<5){
                  System.out.println("You are still a baby");
              }else{
                  System.out.println("You are not a baby but a kid");
              }
              //End of nested if else 2
          }else{
              System.out.println("You are no more in your Teens");
          //End of nested if else one
          }
      }else{                                    //Note that a new if and else are inside this else statement. This is what we call "nested if else statement"
          System.out.println("You are old");
          if(age>75){
              System.out.println("You are REALLY OLD");
          }else{
                      System.out.println("You are not really that old");
                      }
          }
      //End of main if else statement
      }
  }    
//Mind you that your output might be more than one result because the age might satisfy more than one condition
