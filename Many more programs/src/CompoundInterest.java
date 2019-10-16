/*
This is a program that uses the compound interest formula
the formula is A = P * ( 1 + R)^ n
*/
public class CompoundInterest {
    public static void main(String args[]){
        double amount;
        double principal = 10000;
        double rate= 0.01;
        
        //Here we use the for loop. Remember that it is used to select where 
        //you want your loop to begin, where to stop and how much you 
        //want it to increment by.
     for (int month = 1; month <= 20; month++){
         amount = principal * Math.pow(1+rate,month);
         System.out.println("Month " + month +" = "+amount);
     }
    }
    
}
