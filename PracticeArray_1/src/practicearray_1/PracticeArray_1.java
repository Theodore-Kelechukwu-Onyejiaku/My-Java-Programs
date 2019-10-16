/*
 *This is a program to add two dimensional arrays
 */
package practicearray_1;
public class PracticeArray_1 {
    static int a = 10;
    public static void main(String[] args) {
  //Int[][] means that this is a two dimensional array. The [2][2] means that it should have 2 elements in the first row and 2 elements in the second row
  int[][] array1 = new int[2][2];
  //Int[] means that this is a one dimensional array
  int[]   array2 = new int[5];
  //This is to show that you can have as many elements inside a multidimensional array
  //Here the first brackets mean that this is a 3 dimensional array
  //The 2,3 and 4 means that the first row has 2 elements, the second has 4 elements and the third has 3 elements
  int[][][]   array3 = new int[2][4][3];

  /*Initialisation*/
  array1[0][0] = 3;
  array1[0][1] = 4;
  int[][] array5 = {{3,4},{7,6}};
  System.out.println(array5.length);
  //The following is a loop to print the array4 array
  //The .length is a property of an array and do not forget that a property is also known as an object for now. 
  //And that this objects can be accessed if they are declared static just like static methods
  //Example of this is given below.
  System.out.println(PracticeArray_1.a);
  int b = PracticeArray_1.a + 10;
  System.out.println(b);
  System.out.println(array1.length);
  for(int i= 0;i<=array5.length;i++){
      for(int j = 0;j < array5.length;j++){
      System.out.print(array5[i][j]+" "); 
      }
      System.out.println();
  }
    }
    
}
