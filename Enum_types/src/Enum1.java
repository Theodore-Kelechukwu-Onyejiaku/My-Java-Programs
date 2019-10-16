/*This is a program to demonstrate the use of ENUM-TYPES 23/03/19
*/

public class Enum1 {

//To create an enum-type you must use the syntax: ENUM ENUM-TYPE-NAME {LIST OF ENUM CONSTANTS SEPARATED BY COMMAS}    
    enum Colors {BLUE,RED,BLACK,YELLOW,WHITE}//Creation of enum-type-name and enum-values or constants 
    
    public static void main(String[] args){
/*Just like String, int, boolean, char and so on 
any variable that should have the value of these constants have to be decalred using 
the enum-type name    
*/        
      Colors Liverpool;//Declaration for enum-type variable
      Colors Chelsea;  //Declaration for enum-type variable
      Colors Realmadrid;//Declaration for enum-type variable
      
/*To use the enum-constants, they must be used used with their enum-type-name
      Example: Colors.WHITE, Colors.BLUE,etc
      Also to initialize the enum variables above, you must assign the constanst to
      these variables using the same approach
      */
     Liverpool = Colors.RED;//Initialization or assigning the constants to an enum-type variable
     Chelsea = Colors.BLUE;//Initialization or assigning the constants to an enum-type variable
     Realmadrid = Colors.WHITE;//Initialization or assigning the constants to an enum-type variable
/*
     You can print the value of your variable by just using its identifier alone
     */
        System.out.println("The color of Liverpool jersey is "+Liverpool);//Prints Liverpool as RED
        System.out.println("The color of Chelsea jersey is "+Chelsea);//Prints Chelsea as BLUE
        System.out.println("The color of Realmadrid jersey is "+Realmadrid);//Prints Realmadrid as WHITE
    }    
}
        
