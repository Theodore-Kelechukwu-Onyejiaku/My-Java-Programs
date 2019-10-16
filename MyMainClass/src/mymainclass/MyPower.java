package mymainclass;
public class MyPower {
  public int theoPower(int a, int b){
    int c=1;
    int d=0;
       if(b==0){
           d=1;
       }
       else if(b==1){
           d=a;
       }
       else if(b>0){
           do{
               d=a;
               c++;
               d=d*a;
           }while (c<=b);
       }
       else{
         d=0;
       }
           return d;  
}
}  