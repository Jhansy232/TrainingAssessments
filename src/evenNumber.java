// Any integer is input through the keyboard. Write a program to find out
// whether it is an odd number or even number.
import java.util.Scanner;  // Import the Scanner class
public class evenNumber {
	public static void main (String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		if(n%2 == 0) {
	     System.out.println("Entered number is even number");
		}
		else {
			 System.out.println("Entered number is odd number");	
		}
		
	}
}
