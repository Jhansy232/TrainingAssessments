// # Write a program to find the factorial value of any number entered
// through the keyboard.
import java.util.Scanner;  // Import the Scanner class
public class factorial {
		public static void main (String[] args) {
			int n,factorial,i;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a integer");
			n=sc.nextInt();
			factorial=1;
			for(i=1;i<=n;i++) {
				factorial=i*factorial;
				
			}
			System.out.println("factorial of "+ n +" is " +factorial);
		}
}
