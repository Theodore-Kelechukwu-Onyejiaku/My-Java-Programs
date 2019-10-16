/*
*This is a program to test if actually the Enhanced For Loop is used to supply the elements of an array in a single loop
*/

public class EnhancedForLoopClass {
 public static void main(String[] args){
     //Array initialization
     int myArray[] = {2,6,4,3,2,10};
     String myArray2[]= {"Theodore","Chidera","Paul","Emeka","Elijah"};
     
  //Now I want to test the Enhanced For Loop to see if it actually supplies the elements of an array in a single loop
     for (int x:myArray){
         System.out.println(x);
     }
/*
*It is true that the enhanced for loop actually does one loop and this loop is to supply the elements of an array
*/
  //Now I want to use the enhanced for loop to test two array and see if it will actually supply their elements.
     for (String y:myArray2){
          System.out.println(y);
     }
 }    
}