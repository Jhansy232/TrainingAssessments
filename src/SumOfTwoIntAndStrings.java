// Write a Java program to print the sum of two numbers and 2 strings.(user
// input)
import java.util.Scanner;

public class SumOfTwoIntAndStrings {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b;
		String string1, string2;
		System.out.println("Enter the 1st number");
		a= sc.nextInt();//user input
		System.out.println("Enter the 2nd number");
		b= sc.nextInt();//user input
		sc.nextLine();//After reading int there left a new line character which was consumed by scan.nextLine
		System.out.println("Enter the 1st string");
		string1= sc.nextLine();//user input
		System.out.println("Enter the 2nd string");
		string2= sc.nextLine();//user input
		
	
		
		System.out.println("a + b  is "+(a+b));
		System.out.println("string1 + string2 is  "+(string1+string2));
		
	}
}
