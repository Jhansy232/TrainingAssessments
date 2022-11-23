//Write a program to reverse a string
import java.util.Scanner;  // Import the Scanner class
public class ReverseOfString   {
	public static void main (String[] args) {
		
		
		StringBuilder string1 = new StringBuilder("java selenium training");
		System.out.println(string1 );
		string1.reverse();
		System.out.println(string1 );
		
		String string2="Assesments",reverseString="";
		int i,length=string2.length();
		
		char x;
		for(i=(length-1);i>=0 ;i--) {
			x=string2.charAt(i);
			reverseString= reverseString+x;
			
		}
		
		System.out.println(string2 );
		System.out.println(reverseString );
	}
}


