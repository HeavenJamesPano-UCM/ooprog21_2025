// DebugFive4.java
// Output highest of four numbers
import java.util.*;
class DebugFive4 // removed 'public'
{
   public static void main (String[] args) 
   {
      int one, two, three, four;
      int highest;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer >> ");
      one = input.nextInt(); // store first user input
      
      System.out.print("Enter an integer >> ");
      two = input.nextInt(); // store second user input
      
      System.out.print("Enter an integer >> ");
      three = input.nextInt(); // store third user input
      
      System.out.print("Enter an integer >> ");
      four = input.nextInt(); // store fourth user input
      
      if (one >= two && one >= three && one >= four) { // compare all numbers to see if first is largest
         highest = one;
      }
      else if(two >= one && two >= three && two >= four) { // compare all numbers to see if second is largest
         highest = two;
      }
      else if(three >= one && three >= two && three >= four) { // compare all numbers to see if third is largest
         highest = three;
      }
      else {
         highest = four; // if none of the above, fourth must be largest
      }
      
      System.out.println("The highest number is " + highest); // output the largest number
   }
}
