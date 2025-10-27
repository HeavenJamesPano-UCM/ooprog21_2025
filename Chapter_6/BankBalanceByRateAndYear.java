import java.util.Scanner;

class BankBalanceByRateAndYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance: ");
        double balance = input.nextDouble();

        System.out.println();

        double rate = 0.02;
        double newBalance = balance;
        System.out.println("With an initial balance of $" + balance + " at an interest rate of " + rate);

        for (int year = 1; year <= 4; year++) {
            newBalance = newBalance + (newBalance * rate);
            System.out.println("After year " + year + " balance is $" + newBalance);
        }

        System.out.println();

      
        rate = 0.03;
        newBalance = balance;
        System.out.println("With an initial balance of $" + balance + " at an interest rate of " + rate);

        for (int year = 1; year <= 4; year++) {
            newBalance = newBalance + (newBalance * rate);
            System.out.println("After year " + year + " balance is $" + newBalance);
        }

        System.out.println();

        rate = 0.04;
        newBalance = balance;
        System.out.println("With an initial balance of $" + balance + " at an interest rate of " + rate);

        for (int year = 1; year <= 4; year++) {
            newBalance = newBalance + (newBalance * rate);
            System.out.println("After year " + year + " balance is $" + newBalance);
        }

        System.out.println();

        rate = 0.05;
        newBalance = balance;
        System.out.println("With an initial balance of $" + balance + " at an interest rate of " + rate);

        for (int year = 1; year <= 4; year++) {
            newBalance = newBalance + (newBalance * rate);
            System.out.println("After year " + year + " balance is $" + newBalance);
        }

        input.close();
    }
}
