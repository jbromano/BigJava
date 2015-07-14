import java.util.Scanner;

public class TriangleInterface {
   
   public static void main (String args[]) {
   
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter the first x-coordinate: ");
      int firstX = in.nextInt();
      System.out.print("Please enter the first y-coordinate: ");
      int firstY = in.nextInt();
      System.out.print("Please enter the second x-coordinate: ");
      int secondX = in.nextInt();
      System.out.print("Please enter the second y-coordinate: ");
      int secondY = in.nextInt();
      System.out.print("Please enter the third x-coordinate: ");
      int thirdX = in.nextInt();
      System.out.print("Please enter the third y-coordinate: ");
      int thirdY = in.nextInt();
      
      Triangle tri = new Triangle(firstX, firstY, secondX, secondY, thirdX, thirdY);
      
      System.out.println("The length of the first edge is: " + tri.getLength1());
      System.out.println("The length of the second edge is: " + tri.getLength2());
      System.out.println("The length of the third edge is: " + tri.getLength3());
      System.out.println("The first angle is: " + tri.getAngle1() + " degrees.");
      System.out.println("The second angle is: " + tri.getAngle2() + " degrees.");
      System.out.println("The third angle is: " + tri.getAngle3() + " degrees.");
      System.out.println("The perimeter is: " + tri.getPerimeter());
      System.out.println("The area is: " + tri.getArea());
      
   
   }

}
