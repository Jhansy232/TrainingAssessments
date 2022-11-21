import java.util.Scanner;  // Import the Scanner class
public class raisedPower {
	public static void main(String[] args) {
	int base,exponential,i;
	float result=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter base number");
	base=sc.nextInt();
	System.out.println("enter exponential number");
	exponential=sc.nextInt();
	
	for(i=1;i<=Math.abs(exponential);i=i+1) {
		result=result*base;
	}
	if(exponential<0) {
		result=1/(result);
	}
	System.out.println(base +" to the power of "+exponential+" is " +result);
	}
}
