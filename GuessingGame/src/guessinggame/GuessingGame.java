package guessinggame;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
 Random dice = new Random();
 Scanner input = new Scanner(System.in);
 
 int guess;
 int yourguess;
  while(true){  //while loop with a condition TRUE is used to repeat a program 
      System.out.println("This is a game friend!\nYou must guess a number 1 to 100.\nAnd you have only 6 times or less to guess what the answer should be");

    
        for(int counter = 1; counter <=100; counter++){ //This for loop can run for 100 times
              guess = 1 + dice.nextInt(100);//assigning a value to the guess variable
         yourguess = input.nextInt();       //assings the value entered to yourguess variable
         if(yourguess == guess){            //If yourguess is the same as the computer guess
             System.out.println("You guessed it correctly!!!");
             break;                         //WOW, THIS BREAK TERMINATES THIS LOOP!!!But only if this condition is met
         }
         else if(yourguess > 100){          //If yourguess is greater than 100
             System.out.println("Your number is greater than 100, you lose!!!");
             break;                         //This BREAK keyword will terminate this loop.
     }
         else if(yourguess < 1){            //If yourguess is less than 1
             System.out.println("Your number is lesser than 1, you lose!!!");
             break;                         //This BREAK terminates this loop if this condition is met
         }
         else if(counter > 5){              //This loop will prematurely and entirely terminate once the counter becomes 6 
             System.out.println("You lose\nThe guess is :\n"+guess);
             break;                         //This BREAK will terminate this loop entirely
         }       
        else if(yourguess != guess && counter <=5){
             System.out.println("Try Again!!!");
             //Here there is no BREAK!!! And this means that this loop can still continue
         }  
     }
        System.out.println("NEW GAME  NEW GAME NEW GAME NEW GAME");
  }
 }
 

        
    }
//OBSERVATION::::::::
//This program has allowed me to discover the greatness of the BREAK keyword which can terminate a loop if a certain condition is met. 