import java.util.Scanner;

public class Triangle {

   public Triangle(int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y) {
      
      this.x1 = pt1x;
      this.y1 = pt1y;
      this.x2 = pt2x;
      this.y2 = pt2y;
      this.x3 = pt3x;
      this.y2 = pt3y;
      
      calculateProperties();
      
   }
   
   public void calculateProperties () {
   
      calculateLengths();
      calculateAngles();
      calculatePerimeter();
      calculateArea();
   
   }
   
    public void calculateLengths () {
   
      length1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
      length2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
      length3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
   
   }
   
   public void calculateAngles () {
   
      angle1 = Math.toDegrees(Math.acos( ((length1*length1) + (length2*length2) - (length3*length3)) / (2*length1*length2) ));
      angle2 = Math.toDegrees(Math.acos( ((length2*length2) + (length3*length3) - (length1*length1)) / (2*length2*length3) ));
      angle3 = Math.toDegrees(Math.acos( ((length3*length3) + (length1*length1) - (length2*length2)) / (2*length3*length1) ));
   
   }
   
   public void calculatePerimeter() {
   
      perimeter = length1 + length2 + length3;
   
   }
   
   public void calculateArea() {
   
      double s = .5 * perimeter;
      area = Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
   
   }
   
   public double getLength1() {
   
      return length1;
   
   }
   
   public double getLength2() {
   
      return length2;
   
   }
   
   public double getLength3() {
   
      return length3;
   
   }
   
   public double getAngle1() {
   
      return angle1;
   
   }
   
   public double getAngle2() {
   
      return angle2;
   
   }
   
   public double getAngle3() {
   
      return angle3;
   
   }
   
   public double getArea() {
 
      return area;
   
   }
   
   public double getPerimeter() {
 
      return perimeter;
   
   }
   
   private int x1;
   private int y1;
   private int x2;
   private int y2;
   private int x3;
   private int y3;
   private double length1;
   private double length2;
   private double length3;
   private double angle1;
   private double angle2;
   private double angle3;
   private double perimeter;
   private double area;

}
