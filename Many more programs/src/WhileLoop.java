/*This is a program to use the while loop.
It is going to test the post-increment operator before and after the print statement.
*/
public class WhileLoop {
   public static void main(String args[]){
      int counter=0;
      //Here note that the print statement is before the postincrement operator that is after the counter variable
           System.out.println("This is print before the increment");
       while(counter<=10){
           System.out.println(counter);
        counter++;
        //RESULT: 0,1,2,3,4,5,6,7,8,9,10
       }
       counter = 0;
           System.out.println("This is print after the increment");
       while(counter<=10){
        counter++;
           System.out.println(counter);
       //RESULT : 1,2,3,4,5,6,7,8,9,10,11
       }
   } 
}
