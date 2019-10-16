/*
*This is a further program to test the possibilities between the "THIS" keyword and the toString() method
*This time there is no constructor, and I want to know if truly the "THIS" can be used in place of toString()
*And this would be confirmed if it allows argument as indicated by the program below
*/

package thisandtostring;
public class ThisAndToString {
    public static void main(String[] args) {
        String myName="Kelechukwu";
       toString(myName);
    }
    public static String toString(String name){
        System.out.println("The name you entered is\n"+name);
        return name;
    }
    /*
    *CONCLUSION: "THIS" can not be used in place of toString(). It can do so when it is used inside constructors.
    */
}
