public class Balloon {

   public Balloon() {
      
      this.air = 0;
      
   }
   
   public void addAir(double amount) {
   
      air = air + amount;
   
   }
   
   public double getVolume() {
   
      return air;
   
   }
   
   public double getSurfaceArea() {
   
      return 4 * Math.PI * getRadius() * getRadius();
   
   }
   
   public double getRadius() {
   
      return Math.cbrt((.75 * air)/Math.PI);
   
   }
   
   private double air;

}
