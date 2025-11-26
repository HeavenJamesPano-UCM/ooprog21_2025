import java.util.Scanner;

   class CompareStrings{
   
      public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      
      String predefined = "Carmen";
      
      System.out.print("Enter your name: ");
      String   userString = input.nextLine();
      
      if(userString.equals(predefined)){
         System.out.println(predefined + " equals " + userString);
      }else {
         System.out.println(predefined + " does not equal " + userString);
      } 
    }
  }

