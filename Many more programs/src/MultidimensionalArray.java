
//This is a program to test multidimensional arrays
public class MultidimensionalArray {
   public static void main(String[] args){
       int[][] myArray = {{2,4,6},{3,8,9}};//initialising a multidimensional array. The first elements belong to row1 and the second belongs to row2 
//Now I want to use a time-wasting method to get the values of the array using their indexes
       System.out.print(myArray[0][0]);//The first0 represents the first row and the other 0 is the first index
       System.out.print(myArray[0][1]);//The 0 represents the first row and the 1 represents the second index element
       System.out.print(myArray[0][2]);//The 0 represents the first row and the 2 represents the third index element

       System.out.println();
       
       System.out.print(myArray[1][0]);//The 1 represents the second row and 0 represents the first index element
       System.out.print(myArray[1][1]);//The 1 represents the second row and 1 represents the second index element
       System.out.println(myArray[1][2]);//The 1 represents the second row and 2 represents the third index element

//Now we use the for loop to display the elements of the array
   System.out.println();
       for(int counter=0;counter<2;counter++){ //This is to make the nested loop loop two times
           for(int counter2=0;counter2<3;counter2++){//This will loop three times by displaying the three elements of the first row, and then loop another three times to complete its parent loop.
              System.out.print(myArray[counter][counter2]);//This will print the elements starting from myArray[0][0], this is because the counter and counter2 have both been first initialized as 0
           }
           System.out.println();
       }
   }    
}
