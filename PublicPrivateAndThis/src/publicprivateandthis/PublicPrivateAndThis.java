package publicprivateandthis;

public class PublicPrivateAndThis {
    public static void main(String[] args) {
            firstSubClass subObject = new firstSubClass();
            
            subObject.whatever = 56;
            
      System.out.println(subObject.whatever);
      subObject.changeInstance();//This method is just here check the subclass to see why
      subObject.changeTotally(8,7 , 2014);// These variables here can not change the global values of the arguments which have already been done in the subclass
      System.out.println(subObject.messageAnswer());//This only prints the answer
    }
    
}
