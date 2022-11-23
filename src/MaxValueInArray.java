// Write a Java program to find max value of an integer array.
import java.util.Arrays;
public class MaxValueInArray {
	public static void main(String[] args) {
		int a[]= {5,9,7,7,8,56,980,6789};
		int i=a.length;
		Arrays.sort(a);
		System.out.println("Maximum value is "+a[i-1]);
		
		
		
		
	}
}
