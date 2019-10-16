/*
This is a program to test the do while loop 
*/
public class DoWhileLoop {
    public static void main(String args[]){
        
    int counter1 = 0; int counter2 = 10;
    do{
       System.out.println(counter1);
       counter1 ++;
    }while(counter1<=10);  
    System.out.println();
 
//The following is another do while loop to show that it first executes the code body before tessting the condition
    System.out.println("This is another program");
    do{
      System.out.println(++counter2);  //This is a pre-incrementation and prints 11 
    }while(counter2<5);//This conditions means that the codebody should be executed unless the counter2 variable is less than 5.
                       //But because this is a do while loop, the body code will execute first before testing the condition.
    
   }
}
