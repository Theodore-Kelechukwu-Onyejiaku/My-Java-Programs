public class EnumsInSwitch {
    enum Day{SUN,MON, TUE, WED, THU, FRI, SAT}
    public static void main(String[] args){
   //Here we declare a variable of enum type Day
   Day Tomorrow;
   Tomorrow = Day.FRI;
    System.out.println(switcher(Tomorrow));
    }
   public static void switcher(Day x){
      switch (x){
          case SUN: String.format("Tomorrow is %s and it's day %02d",Day.SUN,Day.SUN.ordinal()+1);
          
                    break;
          case MON: String.format("Tomorrow is %s and it's day %02d",Day.MON,Day.MON.ordinal()+1);
                    break;
          case TUE: String.format("Tomorrow is %s and it's day %02d",Day.TUE,Day.TUE.ordinal()+1);
                    break;
          case WED: String.format("Tomorrow is %s and it's day %02d",Day.WED,Day.WED.ordinal()+1);
                    break;
          case THU: String.format("Tomorrow is %s and it's day %02d",Day.THU,Day.THU.ordinal()+1);
                    break;
          case FRI: String.format("Tomorrow is %s and it's day %02d",Day.FRI,Day.FRI.ordinal()+1);
                    break;
          case SAT: String.format("Tomorrow is %s and it's day %02d",Day.SAT,Day.SAT.ordinal()+1);
                    break;
    }   
    
   }
}
