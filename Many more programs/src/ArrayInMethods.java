//This is a program to pass arrays into methods

public class ArrayInMethods {
   public static void main(String[] args){//main method
       int[] myArray = {1,5,6,7,10};      //Array initialisation
       System.out.println(myArray.length);
       arrayChanger(myArray);             //method or function call
 //Now I want to see if the values of the elements have been override by the method. This is done using the while loop and initializing a counter
 //However you have to see it after you have seen how the method below works
       int counter = 0;
       
       while(counter<myArray.length){
         System.out.println(myArray[counter]); 
         counter++;
//The output is 1,5,6,7,10. This means that using the enhanced for loop, which supplies the values of the elements of an array, does not override the real values of the elements of the array
       }
       
       }
   
   //The following is a method that will add 5 to every element of the array
   public static void arrayChanger(int[] c){ //This method is accepting only a single array.
     for(int y:c){                           //Using the enhanced for loop this would create a loop that will supply the elements of the array 
         y=y+5;                              //As you loop, add the value of any elment with 5
       System.out.println(y);                //Prints the computed values of the elments
     }       
   }
}
