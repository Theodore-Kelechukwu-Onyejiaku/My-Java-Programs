
/*
*This is a program to find the sum of elements of an array 
*/
public class SummingUpElementsOFAnArrayClass {
    public static void main(String[] args){
    int myArray[] = {12,19,23,45};
    int sum = 0;
    
    for(int counter = 0;counter<myArray.length;counter++){
        sum = sum + myArray[counter];
       }
    System.out.println("The sum of all the elements of the array is "+sum);
    }
}
