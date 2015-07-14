public class Pair {

   public Pair(double aFirst, double aSecond) {
      
      this.num1 = aFirst;
      this.num2 = aSecond;
      
   }
   
   public double getSum() {
   
      return (num1 + num2);
   
   }
   
   public double getDifference() {
   
      return (num1 - num2);
   
   }
   
   public double getProduct() {
   
      return (num1*num2);
   
   }
   
   public double getAverage() {
   
      return ((num1 + num2)/2);
   
   }
   
   public double getDistance() {
   
      return Math.abs(num1 - num2);
   
   }
   
   public double getMax() {
   
      return Math.max(num1, num2);
   
   }
   
   public double getMin() {
   
      return Math.min(num1, num2);
   
   }
   
   private double num1;
   private double num2;

}
