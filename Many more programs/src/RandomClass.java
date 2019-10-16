/*
*This is a program to test the Random class
*/

import java.util.Random;
  public class RandomClass {
    public static void main(String[] args){
        Random dice = new Random();  //an object is created from the random class
        int counter=1;               //a counter is set
        
        while(counter<=7){
        System.out.println(dice.nextInt(6));//prints out six values of the random generator, from 0 to 6
        counter++;
         } 
        counter=1;
        System.out.println();
        while(counter<=10){
            System.out.println(1+dice.nextInt(10)); //prints out ten values, from 1 to 10
            counter++;
        }
    }
}
