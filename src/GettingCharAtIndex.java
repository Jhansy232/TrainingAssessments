// Write a Java program to get the character at the given index
// within the String.
import java.util.Scanner;  // Import the Scanner class
public class GettingCharAtIndex {
	public static void main (String[] args) {
		String string1;
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		string1=sc.nextLine();
		System.out.println("Enter the index to get the character");
		index=sc.nextInt();
		System.out.println("The character at index of "+ index + " in "+ string1 + " is "+string1.charAt(index)  );
		
		
	}

}
