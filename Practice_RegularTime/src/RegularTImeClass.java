import java.util.Scanner;

public class RegularTImeClass {
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int hour,minutes,seconds;
        System.out.println("THIS IS A PROGRAM THAT CONVERS THE 24 HOUR TIME TO THE REGULAR OR 12 HOUR TIME");
        System.out.println("Please Enter the hour");
  hour = input.nextInt();
  System.out.println("Please Enter the hour");
  minutes = input.nextInt();
  System.out.println("Please Enter the hour");
  seconds = input.nextInt();
        System.out.println(toRegular(hour,minutes,seconds));
 }   
  public static String toRegular(int h,int m,int s){
      
      h=(h>=0&&h<=12)? h  : h%12;
      s=(s>=0 && s<=60) ? s: 0;
      s=(s>=0 && s<=60) ? s: 0;
  return String.format("%02dhrs:%02dmins:%02dsecs%s",h,m,s,(h*2<=12) ? "AM":"PM"); 
 }
}
