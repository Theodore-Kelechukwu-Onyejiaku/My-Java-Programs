public class MainClass{
  public static void main(String[] args){
      SubClass1 object1 = new SubClass1();
      SubClass1 object2 = new SubClass1(5);
      SubClass1 object3 = new SubClass1(5,13);
      SubClass1 object4 = new SubClass1(5,13,43);
      
      System.out.printf("%s\n", object1.toMilitary());
      System.out.printf("%s\n", object2.toMilitary());
      System.out.printf("%s\n", object3.toMilitary());
      System.out.printf("%s\n", object4.toMilitary());
}
}