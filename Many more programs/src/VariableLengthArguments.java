/*This is a program to test the ellipse 
*which is used in methods to allow for infinite number of arguments
*/

public class VariableLengthArguments {
    public static void main(String[] args) {
        String name1="Michael",name2="Jude",name3="James",name4="Whatever";
        int a=10,b=23,c=56,d=60; //variables that we are going to use 
        add(a,b,c,d);            //calling the method
        displayValues(a,b,c,d);  //Calling the method that will display the int values above
        nameDisplayer(name1,name2,name3,name4);//Calling the method that will display the names above
        cuttingNames(name1,name2,name3,name4);//Calling the method that will display the first letter of the names you have already initialized or entered
        
    }    
    //The method below is the main subject of this program
 public static int add(int...numbers){//Using the elipse which is just three dots(...)between a parameter and an argument, you can use as many arguments you want inside this method 
     int total = 0; int average;  //This is the total and the average variable
     for(int variables:numbers){  //This is the enhanced for loop to supply the arguments in a loop
        total = total + variables; //This is to find the total
     }
    average = total/numbers.length;//This is to find the average, the numbers.lenght is the total number of arguments that you used
    System.out.println("The average of the numbers are "+average); //This method, wherever called is going to print this 
    return average;                                                //This is to return a value wherever this method is being called
    }
 
//Another method to just print out the arguments
public static void displayValues(int...values){
    System.out.println("The numbers you entered are:");
    for(int x:values){//using the enhanced for loop which will supply the arguments in a single loop
        System.out.println(x); // This prints out the arguments one by one
    }
}
//Another method to display names
public static void nameDisplayer(String...names){
    System.out.println("The names you entered are:");
    for(String naming:names){//This supplies the names in a single loop
        System.out.println(naming);//This prints out the names one by one
    }
}
//This method will cut out a character from the names you will enter
public static void cuttingNames(String...cuts){
    System.out.println("The first letter of the names you entered are:");
    for(String cutter:cuts){
        System.out.println(cutter.substring(0,1));
    }
}
}
