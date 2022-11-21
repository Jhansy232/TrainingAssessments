// # A company insures its drivers in the following cases:
// # If the driver is married.
// # If the driver is unmarried, male & above 30 years of age.(
// martialstatus==unmarid && age>30, sex==male)
// # If the driver is unmarried, female & above 25 years of age.
// # In all other cases the driver is not insured. If the marital status, sex
// and age of the driver are the inputs, write a program to determine
// # whether the driver is to be insured or not.
import java.util.Scanner;  // Import the Scanner class
public class ifElseDriverInsurance {
	public static void main(String[] args) {
		String maritalStatus,gender;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter driver marital status as married or unmarried");
		maritalStatus=sc.nextLine();
		System.out.println("enter driver gender as male or female");
		gender=sc.nextLine();
		System.out.println("enter driver age");
		age=sc.nextInt();
	
		
		if(maritalStatus.equals("married")) {
			System.out.println("Driver is insured");
		
		}else if (maritalStatus.equals("unmarried") && gender.equals( "male") && age >30) {
			System.out.println("Driver is insured");
		
		}else if (maritalStatus.equals("unmarried") && gender.equals("female") && age >25) {
			System.out.println("Driver is insured");
		
		}else 
			System.out.println("Driver is uninsured");
		
	}
}
