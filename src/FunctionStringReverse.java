//Write a program to reverse a string
import java.util.Scanner;  // Import the Scanner class
public class FunctionStringReverse   {
	public static void main (String[] args) {
		String string1,string2;
		System.out.println("Enter a string to reverse");
		Scanner sc= new Scanner(System.in);
		string1 =sc.nextLine();
	    string2=StringReverse(string1);
		
	
		
		
		
		
		System.out.println(string2 );
		
	}



public static String StringReverse (String string1){
	int i,length=string1.length();
	String reverseString="";
	char x;
	for(i=(length-1);i>=0 ;i--) {
		x=string1.charAt(i);
		reverseString= reverseString+x;
		
	}
return reverseString;
}
}
