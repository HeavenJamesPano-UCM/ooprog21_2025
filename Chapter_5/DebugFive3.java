// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department

import java.util.Scanner;
class DebugFive3 // I removed 'public'
{
   public static void main (String[] args)
   {
      int item;
      String output = ""; // initialize output as an empty string
      final int LOW = 111; // minimum valid item number
      final int HIGH = 999; // maximum valid item number
      final int CUTOFF = 500; // cutoff to decide department
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter item number >> ");
      item = input.nextInt(); // read item number from user
      
      if(item < LOW) // check if item number is below minimum
         output = "Item number too low";
      else
        if(item > HIGH) // check if item number is above maximum
           output = "Item number too high";
        else
           if(item < CUTOFF) // check if item belongs to Automotive Department
              output = "Valid - Item in Automotive Department";
           else
              output = "Valid - Item in Housewares Department"; // else, item is in Housewares Department
              
      System.out.println(output); // display the result
   }
}