import java.util.Scanner;  
public class ReverseOfNumber {
	public static void main (String[] args) {
		int n,remainder,reverse=0,original;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		original=n;
		for(;n>0;n=n/10) {
		remainder=n%10;
		reverse=reverse*10+remainder;
		}
		System.out.println("Reverse of "+original+" is " +reverse);
	}
}
