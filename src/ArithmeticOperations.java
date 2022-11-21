// Take 2 number as input and perform all arithmetic/logical operation on
// that
// a=10
// b=20
// a+b, a-b, a*b, a/b, a%b
// a>b, a<b, a==b, a>=b, a<=b
import java.util.Scanner;  // Import the Scanner class
public class ArithmeticOperations {
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		b=sc.nextInt();
		System.out.println("a+b is " +(a+b));
		System.out.println("a-b is " +(a-b));
		System.out.println("a*b is " +(a*b));
		System.out.println("a+b is " +(a/b));
		System.out.println("a+b is " +(a%b));
		System.out.println("a>b is " +(a>b));
		System.out.println("a<b is " +(a<b));
		System.out.println("a>=b is " +(a>=b));
		System.out.println("a<=b is " +(a<=b));
		System.out.println("a==b is " +(a==b));


		
		
	}
}
