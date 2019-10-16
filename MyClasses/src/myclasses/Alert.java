package myclasses;
/* This is class Alert. Its object called "phone" was created in the main class and this object will perform the following methods when called.*/
public class Alert {
    //This is a method which would be called in the main class
  public void bankAlert(){
      System.out.println("CREDIT ALERT!!!");
      System.out.println("#5,000 has been deposited into your account!");
  } 
   //This is another method which would also be called by the main class
  public void incommingCallAlert(){
      System.out.println("HELLO YOU HAVE AN INCOMMING CALL!!!");
  }
  //This is another method which would also be called by the main class
  public void lowBatteryAlert(){
      System.out.println("WARNING!!!WARNING!!!WARNING!!! LOW BATTERY LOW BATTERY LOW BATTERY!");
  }
}
