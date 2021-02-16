import java.util.*;
abstract class Bank{
  abstract String getDetails();
}
class SBI extends Bank{

   public String getDetails(){
       System.out.println("_________________SBI___________________");
       return "Rate of Interest == 4%";

   }

}
class BOI extends Bank{
    public String getDetails(){
        System.out.println("_________________BOI__________________");
        return "Rate of Interest == 5%";
    }
}
class ICICI extends Bank{
    public String getDetails(){
        System.out.println("_________________ICICI___________________");
        return "Rate of Interest == 6%";
    }
}

public class questionEleven {
    public static void main(String[] args){
        Bank s = new SBI();
        Bank b = new BOI();
        Bank i = new ICICI();
        System.out.println(s.getDetails());
        System.out.println(b.getDetails());
        System.out.println(i.getDetails());


    }
}
