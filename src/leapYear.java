

// Any year is input through the keyboard. Write a program to determine
// whether the year is a leap year or not.
import java.util.Scanner;
public class leapYear {
	public static void main (String[] args){
		int year;
		Scanner sc= new Scanner(System.in);// creating a scanner object
		System.out.println("Enter the year ");
		year= sc.nextInt();	//Taking input from console
        if((year%100)==0 && (year%400)==0){
        		System.out.println("Entered year is leap year ");
        	}
        	else if((year%100)!=0 && (year%4)==0 ){
        		System.out.println("Entered year is leap year ");
        	}
        	else {
        		System.out.println("Entered year is not leap year ");
        	}
        

    
		sc.close();
		
		
		}
}
