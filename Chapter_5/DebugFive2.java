// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;
class DebugFive2 //removed public
{
   public static void main(String[] args)
   {
      int num;
      int num2;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number ");
      num = input.nextInt(); // read the first number from the user
      
      System.out.print("Enter another number ");
      num2 = input.nextInt(); // read the second number from the user
      
      if(num % num2 == 0 || num2 % num == 0) // check if either number divides the other evenly
      {
         System.out.println("One of these numbers is");
         System.out.println("   evenly divisible into the other"); // message if divisible
      }
      else
      {   
         System.out.println("Neither of these numbers is");
         System.out.println("  evenly divisible into the other"); // message if not divisible
      }
   }
}