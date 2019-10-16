/*
This is a program to test the most common methods insidet the Math Class
*/
import java.util.Random;
public class MathClassMethods {
    
    public static void main(String args[]){
        Random dice = new Random();
        
        System.out.println(Math.abs(-100)); //abs : used to know how many numbers you can count from the number till the last number before or after 0
        System.out.println(Math.ceil(12.4)); //ceil: this is used to round up a number or a variable
        System.out.println(Math.floor(12.4));//floor: this is used to round down a number or a variable
        System.out.println(Math.max(2.3,45));//max: this finds the maximum between only two numbers or variables
        System.out.println(Math.min(2.3,4)); //min: this finds the minimum between only two numbers or variables
        System.out.println(Math.sqrt(1.3));   //sqrt: this finds the square root of any number
        System.out.println(Math.pow(10,100000000));//pow: this finds the power of the first number  raised to the second number
        System.out.println(Math.random());         //This is the random method, it prints out numbers only from 0 to 1. It can only be modified when the class is imported and manipulated. An example is given below
     
        System.out.println(1+dice.nextInt(5));    //This will have 5 values to print from 0 to 5 unlike the one above. The 1 + or any number + means that it should start from 1. Therefore, this statement can only print any number from 1 to 5
        
       
    }
}
