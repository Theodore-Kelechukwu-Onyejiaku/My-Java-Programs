/*
This is a program to test the index positions of enum constants
*/
public class EnumOrdinal {
//Enums are treated as arrays and each constan inside the enum type is having its own index number
    enum Letters{A,B,C,D,E}//These are constants and each of them have their position in an index form
    public static void main(String[] args){
//The index number of any constant in an enum is referenced using the built in method called ORDINAL
    System.out.println("The first index of an array is "+Letters.A.ordinal());
    System.out.println("The second index of an array is "+Letters.B.ordinal());
    System.out.println("The third index of an array is "+Letters.C.ordinal());
    System.out.println("The fourth index of an array is "+Letters.D.ordinal());
    System.out.println("The fifth idex  of an array is "+Letters.E.ordinal());
    
    
    }
}
