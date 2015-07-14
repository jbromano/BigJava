
import java.lang.Math;

public class LotteryPrinter {
   
   public static void main(String[] args){
   
     int lottery1 = (int)((Math.random() * 48) + 1);
     int lottery2 = (int)((Math.random() * 48) + 1);
     int lottery3 = (int)((Math.random() * 48) + 1);
     int lottery4 = (int)((Math.random() * 48) + 1);
     int lottery5 = (int)((Math.random() * 48) + 1);
     int lottery6 = (int)((Math.random() * 48) + 1);
     
     System.out.println("Play this combination, it'll make you rich!");
     System.out.println(lottery1 + " " + lottery2 + " " + lottery3 + " " + lottery4 + " " + lottery5 + " "    +  lottery6 + " ");
   
   }
   
   
}
