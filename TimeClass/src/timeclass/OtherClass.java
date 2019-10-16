package timeclass;
// This is a sub class of the main class called Time class
public class OtherClass {
    //The following variables are known as instance variables
 //Recall that this variables can only be accessed by the methods of this class
    private int hour;   
  private int mins;
  private int secs;
  
public void setTime(int h, int m, int s){//This is a method that will convert inputs to hours, minutes and seconds
    hour=(h >= 0 && h <=24) ? (h) : (0); //Will take values that are less 0 and less than or equal to 24
    mins=(m >= 0 && m <=60) ? (m) : (0); //Will take minutes that are 0 and less than or equal to 60
    secs=(s >= 0 && s <=60) ? (s) : (0); // This is just as the minutes.
}
public String toMilitary(){//This method only organizes how the time will be displayed and this time it is military format.
    return String.format("%02d:%02d:%02d",hour,mins,secs); //This is a method that is used for formats alone
    //Please note that the 02d means a specifier. The zero means that it will have no width or no tab and the two means two decimal numbers
}
public String toRegular(){ //This would take the time entered and change it to the regular time
      //1.The expression from the first means that if the hour is equal to 0 or less than 12 it should print the hour entered. Else it should divide it by two and print the result.
      //2.The mins and the secs after the ternary operator means that it should just print anything the user enters.
      //3.The second ternary operator means that it should print AM only if the hour entered is less than 12 or equal to 24.
    return String.format("%d:%02d:%02d %s", (hour==0||hour==12)?(hour):(hour%12),mins,secs,(hour<12||hour==24)?("AM"):"PM");
}
}
