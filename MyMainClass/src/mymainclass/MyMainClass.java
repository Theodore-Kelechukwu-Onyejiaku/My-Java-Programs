package mymainclass;

import java.util.Scanner;
public class MyMainClass {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       MyPower powerer=new MyPower();
       int number;
       int numberPower;
       
          System.out.println("This is a program to find the power of any number");
          System.out.println("Please Enter The number: ");
       number = input.nextInt();
           System.out.println("Please Enter the power: ");
       numberPower = input.nextInt();
          powerer.theoPower(number,numberPower);
           System.out.println("The result of "+number+" raised to the power of "+numberPower+" is "+powerer.theoPower(number, numberPower));
          
    }
    
}
