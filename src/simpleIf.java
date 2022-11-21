/*The current year and the year in which the employee joined
 * the organization are entered through the keyboard. If the number of years for
 * which the employee has # served the organization is greater than 3 then a
 * bonus of Rs. 2500/- is given to the employee. If the years of service are not
 * greater than 3, then the program should do nothing.
 */
import java.util.Scanner;  // Import the Scanner class
public class simpleIf {
	public static void main(String[] args) {
		int currentYear,empJoinYear,bonus=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the current year");
		currentYear= sc.nextInt();
		System.out.println("enter the employee joining year");
		empJoinYear= sc.nextInt();
		if((currentYear-empJoinYear)>3) {
			bonus+=2500;
		}
		System.out.println("Bonus to the employee is "+bonus);
	}
}
