public class Method_1 {
 private int a;
   public Method_1(int figure){
       a = figure;
   }
   public  Method_1(String name){
       System.out.println("Hello your name is "+name);
   } 
   public void setNumber(int figure){
       a = figure;
   }
   public int doNumber(){
       return a;
   }
   public void message(){
     System.out.println("The number you entered is "+doNumber());  
   }
}
