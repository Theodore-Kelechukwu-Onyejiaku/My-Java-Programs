package classconstructor;
public class ClassConstructor {       //Main class
 private String name;                 //Private instance varaible
 public ClassConstructor(String name){  //A constructor that allows a String argument
     this.name=name;                    //This refers to the object that will take in this constructor to make the value of the instance varible the argument entered     
     System.out.println("The name you entered is "+name); //As soon as an object is declared and intialized through this constructor, this program would print this when it is run
 }
     public static void main(String[] args) { //Main method, the only method that can run any expression or statement, not even the constructor
ClassConstructor object = new ClassConstructor("Theodore");  //Here, an object is created and initialized through the constructor above. 
//NOTE: the statement above can not run anywhere outside the main method.
    }
    
}
//WOW!!! I never knew that constructors can be used in main classes