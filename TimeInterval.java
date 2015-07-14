import java.util.Scanner;

public class TimeInterval {

   public TimeInterval(int milTime1, int milTime2) {
      
      this.time1 = ((milTime1 / 100) * 60) + (milTime1 % 100);
      this.time2 = ((milTime2 / 100) * 60) + (milTime2 % 100);
      this.difference = ((time2 - time1) + 1440) % 1440;
      
   }
   
   public int getHours() {
   
      return (difference / 60);
   
   }
   
   public int getMinutes() {
 
      return (difference % 60);
   
   }
   
   private int time1;
   private int time2;
   private int difference;
   
   public static void main (String args[]) {
   
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter the first time: ");
      int firstTime = in.nextInt();
      System.out.print("Please enter the second time: ");
      int secondTime = in.nextInt();
      
      TimeInterval diff = new TimeInterval(firstTime, secondTime);
      
      System.out.println(diff.getHours() + " hours " + diff.getMinutes() + " minutes");
   
   }

}
