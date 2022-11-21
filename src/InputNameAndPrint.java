import java.util.Scanner;  // Import the Scanner class
public class InputNameAndPrint {
	public static void main (String[] args){
	Scanner sc= new Scanner(System.in);// creating a scanner object
	System.out.println("Enter your name");
	String name;
	name= sc.nextLine();	//Taking input from console
	System.out.println("Welcome to java sel world " + name);
	sc.close();
	
	
	}
}
