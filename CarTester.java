public class CarTester {

   public static void main(String args[]) {
   
      Car myCar = new Car(35);
      myCar.addGas(15);
      myCar.drive(105);
      double gasLeft = myCar.getGasInTank();
      
      System.out.println("There are " + gasLeft + " gallons left in the tank.");
   
   }
}
