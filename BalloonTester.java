public class BalloonTester {

   public static void main(String args[]) {
   
      Balloon myBalloon = new Balloon();
      
      System.out.println("Adding 100cm^3 to the balloon.");
      myBalloon.addAir(100);
      System.out.println("Volume: " + myBalloon.getVolume() + "cm^3");
      System.out.println("Surface Area: " + myBalloon.getSurfaceArea() + "cm^2");
      System.out.println("Radius: " + myBalloon.getRadius() + "cm");
      
      System.out.println();
      
      System.out.println("Adding another 100cm^3 to the balloon.");
      myBalloon.addAir(100);
      System.out.println("Volume: " + myBalloon.getVolume() + "cm^3");
      System.out.println("Surface Area: " + myBalloon.getSurfaceArea() + "cm^2");
      System.out.println("Radius: " + myBalloon.getRadius() + "cm");
      
   
   }

}
