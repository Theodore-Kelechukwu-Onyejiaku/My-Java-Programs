//This is a program to test array 
public class ArrayClass {
     public static void main(String[] args){
        //with this kind of array initialization, 
        //I will have to start creating the values for the indexes and this is not really what is array
        //importantly, this method is always used when a Scanner object is needed.
         int myArray[] = new int[5];  //RECENTLY: this is an informal way to create an array.The foraml way is int[] myArray[] = new int[5]
         int counter=0;
          
          myArray[0]=1;
          myArray[1]=2;
          myArray[2]=3;
          myArray[3]=4;
          myArray[4]=5;
    while(counter<5){
        System.out.println(myArray[counter]);
        counter++;
    }
       //however with this kind, which is called array initializer method
       //I do not have to start creating the values of the indexes
       //with this also, I do not have to set the number of values my array should take
       //this is used when there is no need for Scanner class
          int myOtherArray[]= {1,2,3,4,5}; //RECENTLY: this is not the formal way of creating an array
                                           //The way is int[] myOtherArray = {1,2,3,4,5} 
    counter=0;
    while(counter<5){
        System.out.println(myOtherArray[counter]);
        counter++;
    }
     
         
     }
     
}
