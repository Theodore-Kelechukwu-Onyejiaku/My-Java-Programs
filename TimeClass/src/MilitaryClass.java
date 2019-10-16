import java.util.Scanner;
public class MilitaryClass {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int hour,minutes,seconds;
         System.out.println("This is a program to display numbers in Military format");
         System.out.println();
         System.out.println("Please Enter the hour");
         hour = input.nextInt();
         System.out.println("Please Enter the minutes");
         minutes = input.nextInt();
         System.out.println("Please Enter the seconds");
         seconds = input.nextInt();
         System.out.println(toMilitary(hour,minutes,seconds));
     }    
     public static String toMilitary(int h,int m, int s){
         h = (h >= 0 && h<=24) ? h : 0;
         m = (m >= 0 && m<=60) ? m : 0;
         s = (s >= 0 && s<=60) ? s : 0;
      return String.format("%02dhrs:%02dmins:%02dsecs",h,m,s);
     }
}
