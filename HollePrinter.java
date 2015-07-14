
import java.lang.Math;
 
public class HollePrinter {
   
   public static void main(String[] args){
   
     String str = "Hello World!";
     str = str.replace("o", "   ");
     str = str.replace("e", "  ");
     str = str.replace("   ", "e");
     str = str.replace("  ", "o");
     System.out.println(str);
   
   }
   
   
}
