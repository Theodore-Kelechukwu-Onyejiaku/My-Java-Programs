/*This is a program, in fact a dice game between two players
*The main point here is to know how to make use of the class Random
*/

import java.util.Scanner;    //Importing the Scanner class
import java.util.Random;     //Importing the Random class
public class DiceClass {
    public static void main(String[] args){
       Scanner input =new Scanner(System.in); //Creating a Scanner object
       Random dice = new Random();            //Creating a Random object
    
       String player1,player2;                     //name of the two players
       int player1No,player2No,total1=0,counter=1,total2=0;  //integer variables for the dice no, the counter and total of all the values of the nos
       System.out.println("This is a dice game. And you are going to play it three times");  //prompt
       System.out.println("Player1 please enter your name:");                                //prompt to enter user name
         player1 = input.nextLine();                                                         //player one enters name
       System.out.println("Welcome "+player1.toUpperCase());                                 //Greeting to player one in upper case using the toUpperCase() method
       System.out.println("Player2 please enter your name:");                                //prompt to enter user name
         player2 = input.nextLine();                                                          //player two enters user name
        System.out.println("Welcome "+player2.toUpperCase());                                 //Greeting to player two in upper case using the toUpperCase() methodc
       
        System.out.println(player1.toUpperCase()+" please enter roll dice to play your dice.");//asks player one to just typr in roll dice 
                input.nextLine();                                                              //just an scanner to input the roll dice string but no value is stored
               
                /*Here the game is played*/
                //Notice that there is 1 + dice.nextInt(6). This means that the dice should have a maximum of the value 
                //six and should start from 1 and not from 0 which is the default. Thus the random value could be 1,2,3,4,5 and 6. 
                while(counter<=3){ //Since counter has been set as 1, the number of times for this loop is 3
                    player1No =1 + dice.nextInt(6);          //playerNo1 stores the first random value
                     System.out.println(player1.toUpperCase()+" your result "+counter +" is "+player1No); //Prompt to display the results of the random values
                    total1 = total1 + player1No;             //total1 is set 0 and with this statement, the total will now add the values of the dice. This is because the playerNo variable overrides anytime the loop begins again
                    counter++;                               //counter postincrementation
                }
       //The comments for the following codes are just the same for the one above        
       System.out.println(player2.toUpperCase()+" please enter roll dice to play your dice."); //The comment starts here
                input.nextLine();
                counter =1;
        while(counter<=3){
                   player2No =1 + dice.nextInt(6);
                   System.out.println(player2.toUpperCase()+" your result "+counter +" is "+player2No);
                    total2 = total2 + player2No;
                    counter++;
                }                                                                              //ends here
        System.out.println("The total for "+player1.toUpperCase() +" is "+total1);  //displays the total for player one
        System.out.println("The total for "+player2.toUpperCase() +" is "+total2);  //displays the total for player two
        
        /*
        *The following is using a ternary operator. if total1 is greater than total2, the first expression will only be executed. Else, the other expression
        */
        System.out.println((total1>total2) ? ("The winner is "+player1.toUpperCase()):("The winner is "+player2.toUpperCase()));
    }
}/*
*Please note that the if else statement is what that should have been used. Hence, when the totals are the same, the winner is no one.
*/
