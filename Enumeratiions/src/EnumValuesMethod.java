/*
This is a program to basically display all the values contained in an enum list
and it is also a program to run an enhanced for loop on an enum type
 */
public class EnumValuesMethod {
    public enum Month{JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}
   public static void main(String[] args){
//In order to loop this array which will dislay all its constants, the for loop will be very handy here.
//Also know that the built in method that can allow the enum-type-variable to release its constants is found in the "values()" method.
       for(Month x: Month.values()){
           System.out.println(x);
       }
   System.out.println(Month.valueOf("MAR"));
   } 
}
