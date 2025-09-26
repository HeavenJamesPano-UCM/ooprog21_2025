// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
public class DebugFour1 //I removed public so the code works in older Java versions.
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int radius;
      Circle c = new DebugCircle(); // changed 'Circle c = new Circle();' to 'Circle c = new DebugCircle();'
      System.out.print("Enter a radius for a circle >> ");
      radius = input.nextInt();
      c = new DebugCircle(radius); // changed 'new DebugCircle(c)' to 'new DebugCircle(radius)'
      System.out.println("The radius is " + c.getRadius()); // changed from 'c.getRad()' to 'c.getRadius()'
      System.out.println("The diameter is " + c.getDiameter()); // changed from 'c.getDia()' to 'c.getDiameter()'
   }
}
