// Write a Java program to find min value of an integer array.
import java.util.Arrays;

public class MinValueArray {
	public static void main(String[] args) {
		int a[]= {5,9,7,7,8,-1,56,980,6789};
		int i=a.length;
		Arrays.sort(a);
		System.out.println("minimum value is "+a[0]);
	}
}
