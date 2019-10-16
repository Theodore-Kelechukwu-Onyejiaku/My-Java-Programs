public class Variables {
      public static void main(String args[]){
/*The decimals are only float and double. The float can only have seven precision or significant figures.
The double can only have 15 precisions. Precisions means the total number before and after the decimal point.
Try printing the following double and float and you would be surprised.
*/

          double numberOfSecondsLived=2.2e10;    
          double height=1234567891234.10;                         //The double has 15 precisions or significant figures.
          float favouriteDecimal=8.66666666666666666F;         //The float has 7 precisions.

/*What follows is the integer values. Their maximum is gotten by finding the power of two
  raise to the power of their bits and divided by two and subtracted by 1. 
*/

          byte id_no=127;                             //This is the maximum value for a byte. Just 1 byte and this means 2 to the power of 8.
          short numberOnClassList=32767;              //This is the maximum value for short. It is just 2 bytes which means 2 to the power of 16.
          int age=-22;                                 //The maximum number for int is 2147483647 anything added to this would cause errors
          long reg_no=9223372036854775807L;           //This is the maximum value a long value can have. 
                                                      //Remember to add uppercase L to the number as it will not allow more than this without the letter. 
         boolean imtStudent=true;
         String nameOfStudent="Onyejiaku Theodore Kelechukwu";
          
          System.out.println(numberOfSecondsLived);
          System.out.println(favouriteDecimal);
          System.out.println(height);
          System.out.print(" ");
          System.out.println( age);
          System.out.println(nameOfStudent);
          System.out.println(reg_no);
          
      }    
}
