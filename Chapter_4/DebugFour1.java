// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
class DebugFour1 //I removed public so the code works in older Java versions.
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int radius;
      DebugCircle c = new DebugCircle(radius); // i changed 'Circle c = new Circle();' to 'DebugCircle c = new DebugCircle(radius);'
      System.out.print("Enter a radius for a circle >> ");
      radius = input.nextInt();
      c = new DebugCircle(radius); // i changed 'new DebugCircle(c)' to 'new DebugCircle(radius)'
      System.out.println("The radius is " + c.getRadius()); // error 'c.getRad()' i changed to 'c.getRadius()'
      System.out.println("The diameter is " + c.getDiameter()); // error 'c.getDia()' i changed to 'c.getDiameter()'
   }
}

