/*
*This is a program to sum the elments of an array using the Enhanced for Loop
*/
public class EnhancedForLoop {
    public static void main(String[] args){
        //Array initialization
        int[] myArray = {1,2,5,6,6};   //This is the formal way of initializing an array
                                       //Another way is int myArray[]={21,34,5,6}
                                       //However, this latter method is the inforaml way to help C++ programmers
        int sum=0;
       
        //This for loop means that it should supply the elements of the array in one single loop
        for(int x:myArray){
        //As it supplies the elements in a single loop the sum should add them, one by ones
            sum = sum + x;              
        }        
        System.out.println("The sum of the array is "+sum);
    }
}
