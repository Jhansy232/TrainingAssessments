// # Write a program to enter the numbers till the user wants and
// # at the end it should display the count of positive, negative and
// # zeros entered.
import java.util.Scanner;  // Import the Scanner class
public class CountOfEnteredInt {
	public static void main (String[] args) {
		int positives=0,negatives=0,zeros=0,n;
		String string;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer");
		n=sc.nextInt();
			if (n>0) {
			positives=positives+1;
			}
			else if(n<0) {
			negatives=negatives+1;
			}
			else {
			 zeros=zeros+1;	
			}
			sc.nextLine();
		System.out.println("Enter Y or Yes or yes or y to continue and N or n or no or No to stop");
		string=sc.nextLine();
		}while(string.equalsIgnoreCase("y")||string.equalsIgnoreCase("yes"));
		System.out.println("number of positive numbers are "+positives);
		System.out.println("number of negative numbers are "+negatives);
		System.out.println("number of zero numbers are "+zeros);
	}
}
