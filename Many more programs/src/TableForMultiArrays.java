public class TableForMultiArrays {
  public static void main(String[] args){
      int[][] firstArray ={{1,23,45},{37,45,34},{9,86,7}}; //these are the lis or rows 
      int[][] secondArray = {{1,3,54},{5,6,8},{89,4,6}};
      
      System.out.println(firstArray.length);
      System.out.println(firstArray[0].length);
      System.out.println("This is the first array");
      arried(firstArray);
      System.out.println("This is the second array");
      arried(secondArray);
  }
 public static void arried(int[][] x){
      for(int row=0;row<x.length;row++){      //Here the x.length is the highest number of elements of any row even if this is multidimensional array. And this is 3
          for(int column=0;column<x[row].length;column++){ //x[row].length or x[0].length represents the highest number of elements of the array. And this is 3
              System.out.print(x[row][column]+"\t");
          } 
          System.out.println();
      }
  }    
}
