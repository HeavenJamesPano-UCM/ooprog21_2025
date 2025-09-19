// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
     class DebugThree1{//remove public keyword in the class to make it more compatible with older Java versions

            public static void main(String [] args){ //"( String args [])" it should be "(String[] args)"
            double check1;
            double check2;
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter the amount of your check >> ");
            check1 = input.nextDouble();//Error on "input.nextInt", it should be "input.nextDouble to support decimal values"
            
            System.out.print("Enter the amount of your friend's check >> ");
            check2 = input.nextDouble(); //Error on "input.nextInt", it should be "input.nextDouble to support decimal values"
         

            calcTip(check1);
            calcTip(check2);
       }
      public static void calcTip(double bill) {//I put double bill as a parameter to receive input values
            final double RATE = 0.15;//Syntax error "doubel" it should be "double"
             double tip;
             tip = bill * RATE; //it should be bill * rate
             System.out.println("The tip should be at least $" + tip);
      }
}
