/*
 *This is a program to tabulate some values and their corresponding indices
 */
public class ArrayTableClass {
    public static void main(String[] args){
    int myArray[]={12,54,6,7,78,34};
    System.out.println("index\tvalue" );
    for(int counter =0;counter<myArray.length;counter++){
    System.out.println(counter+"\t"+myArray[counter]);
  }
 }
}
