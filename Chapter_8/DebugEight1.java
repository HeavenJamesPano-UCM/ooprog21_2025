// Application lists valid shipping codes
// A, C, T, or H
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid

import java.util.*;

class DebugEight1 //Removed public so the code works in older Java versions.
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        char userCode;
        String entry;

        boolean found = false; // should start as false because we haven't found the code yet.

        char[] okayCodes = {'A','C','T','H'};

        System.out.println("Enter shipping code for this delivery.");
        System.out.print("Valid codes are: ");

        for(int x = 0; x < okayCodes.length; ++x)  // Should be < okayCodes.length so all 4 codes print.
        {
            System.out.print(okayCodes[x]);
            if(x != (okayCodes.length - 1))
                System.out.print(", ");
        }

        System.out.print(" >> ");
        entry = input.nextLine();

        userCode = entry.charAt(0); // should be charAt(0); charAt(1) reads 2nd character and can crash

        for(int i = 0; i < okayCodes.length; ++i)
        {
            if(userCode == okayCodes[i]) // using == compares characters correctly
            {
                found = true;
            }
        }

        if(found) // logic fixed
            System.out.println("Good code");
        else
            System.out.println("Sorry code not found");
    }
}
