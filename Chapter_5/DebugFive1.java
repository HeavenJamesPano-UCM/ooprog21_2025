// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import java.util.*;
class DebugFive1 // removed 'public'
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      final double HIGH_PRICE = 2.59; // price for burger or hotdog
      final double MED_PRICE = 1.99;  // price for grilled cheese or fish sandwich
      final double LOW_PRICE = 0.89;  // price for fries
      int usersChoice;
      double bill = 0; // initialize the total bill
      
      System.out.println("Order please  1 - Burger  2 - Hotdog");
      System.out.print("3 - Grilled cheese   4 - Fish sandwich >> ");
      usersChoice = kb.nextInt(); // read user's main food choice
      
      if(usersChoice == 1 || usersChoice == 2) // check if user chose burger or hotdog
         bill = bill + HIGH_PRICE;
      else 
         bill = bill + MED_PRICE; // otherwise, use medium price
      
      System.out.print("Fries with that?  1 - Yes  2 - No >> ");
      usersChoice = kb.nextInt(); // read user's choice for fries
      
      if(usersChoice == 1) // if user wants fries, add its price
         bill = bill + LOW_PRICE;
      
      System.out.println("Total bill is " + bill); // display the total bill
   }
}

