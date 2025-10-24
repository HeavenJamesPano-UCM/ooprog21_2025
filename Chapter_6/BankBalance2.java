import java.util.Scanner;

class BankBalance {
    public static void main(String[] args) {

        double balance;
        int response;
        int year = 1;
        final double INTEREST_RATE = 0.03;
        Scanner input = new Scanner(System.in);         

        System.out.print("Enter your initial bank balance: ");
        balance = input.nextDouble();

        System.out.println("Do you want to the balance at the end of another year?");
        System.out.print("Enter 1 for yes or any other number for no: ");
        response = input.nextInt();

        do{balance = balance + (balance * INTEREST_RATE);
            System.out.println("After year " + year + " at " +   INTEREST_RATE  +
                               " interest rate, balance is $" + balance);
            year = year + 1;

            System.out.println("\nDo you want to the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no: ");
            response = input.nextInt();
        } while (response == 1);
        
    }
}
