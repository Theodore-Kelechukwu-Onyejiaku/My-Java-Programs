package publicprivateandthis;
   public class firstSubClass {
       //The variables below are global variables 
     public int whatever = 7;
     private int day = 18; 
     private int year =1996;
     private int month =4;
     
     public void changeInstance(){ // This method override the previous values of the variables above
        //day = 23;
        //month = 7;
        //year = 1990;
       }  
     public void changeTotally(int day, int month, int year){//This method accepts variables and this time it it global variables 
         this.day =22;       //without the "this" keyword the real value of day will not change 
         this.month = 01;    //Without the "this" keyword the real value of month will not change
         this.year = 2019;   //Without the "this" keyword the real value of year will not change
         
     }
      public String messageAnswer(){//This method only displays the answer the way we want it
          
          return   String.format("%d/%d/%d",day,month,year);
                  
      }
      //At the end of this program I am able to understand global variables can be modified when we have them already inside the containers of our memory
      //Therefore, it is impossible for any method that accepts these variables as inputs to change their real values. It is just like bringing counterfiet
      //variables when we know that we have the original ones. Also, methods which do not accept them as inputs are really the ones that can change them,
      //because they already know that these varibles do not need to be brought inside the storage home.
}
