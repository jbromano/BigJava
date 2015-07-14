public class Car {

   public Car(double milesPerGallon) {
      
      this.mileage = milesPerGallon;
      this.gasInTank = 0;
      
   }
   
   public void drive(double miles) {
   
      double gallonsUsed = miles/mileage;
      gasInTank = gasInTank - gallonsUsed;
   
   }
   
   public double getGasInTank () {
   
      return gasInTank;
   
   }
   
   public void addGas (double gallons) {
   
      gasInTank = gasInTank + gallons;
   
   }
   
   private double mileage;
   private double gasInTank;

}
