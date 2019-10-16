public class PrivateVariable {
   private String firstName;
   public String spee="Theodore";
   private String ter="Kc";
   
     public void setName(String name){      //When this method is used it sets the argument to be equal to firstName
         firstName=name;
     }
     public String getName() {              //The only job this will do is to return
         return firstName;
     }
     public void message(){                  //This will only display a message with the first name of the user of this program
         System.out.printf("Your first name is %s\n",getName());
     }        
     
}
