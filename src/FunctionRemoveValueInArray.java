
// Write a Java program to remove a specific element from an array.
import java.util.Arrays;
import java.util.ArrayList;
public class FunctionRemoveValueInArray {
	public static void main(String[] args) {
		int a[]= {1,7,8,9,4,6,9,89,4};
		RemoveValueInArray(a,4);
	}


public static void RemoveValueInArray (int a[], int n){
	ArrayList<Integer> ArrL = new ArrayList<Integer>(2);
	int i;
	for(i=0;i<a.length;i++) {
		if(a[i]!=n) {
			ArrL.add(a[i]);
		}
	}
			
	System.out.println(ArrL);
	
}
}
