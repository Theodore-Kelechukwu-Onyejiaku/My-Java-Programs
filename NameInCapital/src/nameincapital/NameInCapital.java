package nameincapital;
import java.util.Scanner;
public class NameInCapital {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        String name;
   System.out.println("Please enter your name:");
    name = input.nextLine();
    System.out.println("Welcome "+name+" your name in capital is:\n"+name.toUpperCase());

    }
    
}
