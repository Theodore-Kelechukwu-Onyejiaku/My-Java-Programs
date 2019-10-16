package myclasses;

/*This is the class with the main method, other classes can't run except this class
Also it calls other methods of other classes.
*/

public class MyClasses {
    public static void main(String[] args) {
//Here I will create an object of the class Alert so that its method can be called and performed.
  Alert phone = new Alert();
  
//Here the phone displays a bank alert
  phone.bankAlert();
  System.out.println();    //This is just to create an empty line
  
//Here the phone displays an incomming call alert
  phone.incommingCallAlert();
  System.out.println();   //This is just to create an empty line
  
//Here the phone displays a low battery warning alert
  phone.lowBatteryAlert();
    }
    
}
