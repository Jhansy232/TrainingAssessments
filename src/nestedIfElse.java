// # The marks obtained by a student in 5 different subjects are input
// through the keyboard. The student gets a
// # division as per the following rules: Percentage above or equal to 60 -
// First division
// # Percentage between 50 and 59 - Second division
// # Percentage between 40 and 49 - Third division
// # Percentage less than 40 - Fail
// # Write a program to calculate the division obtained by the student
import java.util.Scanner;  // Import the Scanner class
public class nestedIfElse {
	public static void main(String[] args) {
		int sub1,sub2,sub3,sub4,sub5;
		float percentage,studenttotal;
		float totalmarks=500;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the subject 1 marks");
		sub1=sc.nextInt();
		System.out.println("enter the subject 2 marks");
		sub2=sc.nextInt();
		System.out.println("enter the subject 3 marks");
		sub3=sc.nextInt();
		System.out.println("enter the subject 4 marks");
		sub4=sc.nextInt();
		System.out.println("enter the subject 5 marks");
		sub5=sc.nextInt();
		
		studenttotal=sub1+sub2+sub3+sub4+sub5;
		percentage=(studenttotal/totalmarks)*100;
		System.out.println("Total is "+studenttotal);
		System.out.println("percentage is "+percentage);
		if (percentage>=60) {
			System.out.println("The student got first division");
		}
		else if (percentage>=50 && percentage<=59) {
			System.out.println("The student got second division");
		}
		else if (percentage>=40 && percentage<=49) {
			System.out.println("The student got third division");
		}
		else if (percentage<40 ) {
			System.out.println("The student failed");
		}
		
		
	}
}
