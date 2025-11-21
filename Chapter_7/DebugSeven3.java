
// Program accepts a String and displays some facts
import java.util.*;
class DebugSeven3 //I removed the public so that the code works in older Java Versions
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
String quote, charString;
char searchChar;
System.out.print("Enter a famous quote >> ");
quote = kb.nextLine();// I added kb. because nextLine cannot run by itself
System.out.print("Enter a character to search for >> ");
charString = kb.next(); // I removed Int so that it can read char
searchChar = charString.charAt(0);
System.out.println("index of('" + searchChar + "') is: " +
quote.indexOf(searchChar));// I put parenthesis
System.out.println("indexOf('a') is: " + quote.indexOf('a'));//Missing parenthesis so I put one
System.out.println("indexOf('x') is: " + quote.indexOf('x'));
System.out.println("charAt(5) is: " + quote.charAt(5));
System.out.println("replace('e', '*') is: " +
quote.replace('e', '*')); //I change repplace to replace
}
}
