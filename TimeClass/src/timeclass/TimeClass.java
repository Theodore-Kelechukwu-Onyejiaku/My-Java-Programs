/*
*This is a progam to display the two different time formats
 which are the military and the regular time
*/
package timeclass;
import java.util.Scanner;
public class TimeClass {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   OtherClass timer = new OtherClass();
   int hour, mins, secs;
   System.out.println("Please enter the hour, minutes and seconds.\nPlease note that the hour is in 24 hour format");
   hour = input.nextInt();
   mins = input.nextInt();
   secs = input.nextInt();
   
 timer.setTime(hour,mins,secs);
System.out.println(timer.toMilitary());
System.out.println(timer.toRegular());
    }
    
}
