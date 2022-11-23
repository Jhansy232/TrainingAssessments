// Write a Java program to convert all the characters in a string to
//uppercase
import java.util.Scanner;  // Import the Scanner class
public class UppercaseOfString   {
	public static void main (String[] args) {
		String string1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1");
		string1=sc.nextLine();
		
		System.out.println("Upper case of "+"'"+string1+"'"+ " is "+ string1.toUpperCase());
	}
}


