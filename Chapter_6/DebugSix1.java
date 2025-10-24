// Start with a penny
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;
 class DebugSix1 //Removed public so the code works in older Java versions.
{
public static void main(String args[])
{
Scanner keyboard = new Scanner(System.in);
int days;
double money = 0.01;
int day = 1;
System.out.print("Enter number of days >> "); //Missing semicolon
days = keyboard.nextInt();
while(day <= days)//Incorrect condition it should be day <= days
{
money = 2 * money;
System.out.println("After day " + day +
" you have " + money); //Replace days with day so it shows the correct day number
++day; // add 1 to day after printing so the day number is right
}
}
}
