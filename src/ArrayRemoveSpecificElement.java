
// Write a Java program to remove a specific element from an array.
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayRemoveSpecificElement {
	public static void main(String[] args) {
		int a[]= {1,7,8,9,4,6,9,89,4};
		ArrayList<Integer> ArrL = new ArrayList<Integer>(2);
		int n=4,i;
		for(i=0;i<a.length;i++) {
			if(a[i]!=4) {
				ArrL.add(a[i]);
			}
		}
				
		System.out.println(ArrL);
		
	}
}
