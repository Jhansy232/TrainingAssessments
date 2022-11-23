// Write a Java
// program to concatenate a given string to the end of another string
import java.util.Scanner;  // Import the Scanner class
public class ConcateTwoStrings {
	public static void main (String[] args) {
		String string1,string2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1");
		string1=sc.nextLine();
		System.out.println("Enter string2");
		string2=sc.nextLine();
		string1=string1.concat(string2);
		System.out.println(string1);
		
	}
}
