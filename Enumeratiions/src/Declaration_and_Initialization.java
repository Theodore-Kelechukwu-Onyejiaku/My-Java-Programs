/*
This is a program to test the use of ENUM TYPES
*/
public class Declaration_and_Initialization {
    //ENUMS are used to create constants
        enum Days{MON,TUE,WED,THUR,FRI,SAT,SUN}//Enum constants or values, formally, should be in CAPITAL LETTERS.  
   public static void main(String[]args){
   //Enum constants are accessed using their enum name type together with their name.
        System.out.println("The day of the week today is\t"+Days.SAT);//PRINTS The day of the week today is SAT
   //Variables that you wish to assign this constants must be daclared as an enum type of the constants
        Days Tomorrow;                                                //Variable Tomorrow becomes enum type Days
   //You can initialize also using the full name of the enum constant
        Tomorrow = Days.SUN;
   //Tomorrow above now has the value SUN
        System.out.println("The day after today is\t"+Tomorrow);       //Prints out the day after tomorrow is SUN
   //Since enums are actually arrays of another data type, the index position of every constant can be known      
   }
}
