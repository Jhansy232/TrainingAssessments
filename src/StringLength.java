//Write a java program to get the length of a given string.
import java.util.Scanner;  // Import the Scanner class
public class StringLength {
	public static void main (String[] args) {
		String string1;
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1");
		string1=sc.nextLine();
		length=string1.length();
		
		System.out.println("length of string "+"'"+string1+"'"+" is "+length);
	}
}
