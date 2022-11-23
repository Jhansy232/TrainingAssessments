//Write a java program to count a character of a
// String.
import java.util.Scanner;  // Import the Scanner class
public class  CountingCharacter {
	public static void main (String[] args) {
		String string1;
		char x;
		int length,i,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		string1=sc.nextLine();
		System.out.println("Enter the character to count the number of occurances in  "+string1);
		x=sc.next().charAt(0);
		length=string1.length();
		for(i=0;i<length;i++) {
			if(string1.charAt(i)==x) {
				count=count+1;
			}
		}
		
		System.out.println("occurances of "+"'" +x+ "'" +" in "+"'"+string1 +"'"+" is "+count);
		
		
	}

}
