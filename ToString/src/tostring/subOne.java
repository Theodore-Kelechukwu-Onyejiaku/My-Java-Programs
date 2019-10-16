package tostring;
public class subOne {
     //Below is instance variables declaration that can only be accessed
     //and modified by the methods that are inside this class
  private  int hour, minute, second;
     //below is a constructor that accepts three arguments 
  public subOne(int h, int m,int s){ 
     hour = h;       //initializes the instance variable hour as the value of the input integer-value h
     minute = m;     //initializes the instance varaible minute as the value of the input integer-value m
     second = s;     //initializes the instance variabel second as the value of the input integer-value s
     //Below,this constructor will not only assign values to the instance variables but will also print out a message
    System.out.printf("The constructor prints out %s",this); //this here refers to the value that will be returned by the built in method called "toString()" which is below
 }   
  //Below is a built in java method that can be replaced with this when there is the need to return its value
 
 public String toString(String name){
   return String.format("Hello you are:\n%s",name);
          
 }
}
