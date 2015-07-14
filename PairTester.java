import java.util.Scanner;

public class PairTester {
   
   public static void main(String args[]) {
      
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      double firstNum = in.nextDouble();
      System.out.print("Enter another number: ");
      double secondNum = in.nextDouble();
      System.out.println();
      
      
      Pair aPair = new Pair(firstNum, secondNum);
      
      System.out.println("The sum is: " + aPair.getSum());
      System.out.println("The difference is: " + aPair.getDifference());
      System.out.println("The product is: " + aPair.getProduct());
      System.out.println("The average is: " + aPair.getAverage());
      System.out.println("The absolute distance is: " + aPair.getDistance());
      System.out.println("The maximum number of the pair is: " + aPair.getMax());
      System.out.println("The minimum number of the pair is: " + aPair.getMin());
   
   }

}
