/*In this ide, of course i dont know about some others, 15 precisions means 16 numbers all together.
*/      
public class TestingDoubleAndFloat {
  public static void main(String args[]){
      double x = 0.8035714285714286777;     //This is more than 15 precisions 
       float y=324.3989234399F;             //This is more than 7 precisions 
 /*Please note that double has 15 precisions and float has 7 precisions*/
 
       System.out.println(x);               //Prints x as 0.8035714285714287 which means 16 numbers all together
       System.out.println(y);               //Prints y as 324.39893 which is 8 numbers alltogether
  
/*Please note that you start counting from the first non-zero number in order to know your precisions
Example 0.000000888888888888888F  would print as 0.0000008888889, please start from 8 as you count the precisions. but this would be different as this would
give just 7 total numbers.
*/
      float a = 0.000000888888888888888F; 
      float b = 0.12345678F;
      
         System.out.println(a); // Prints as 8.888889E-7 meaning 0.0000008888889
         System.out.println(b); // prints as 
  }  
}

