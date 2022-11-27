// Write a Java program to find the duplicate values of an array of integer
// values.
import java.util.Arrays;
import java.util.ArrayList;
public class FunctionDuplicatesInArray {
	public static void main(String[] args) {
		int a[]= {1,1,1,1,5,5,6,1,5,7,8,8,7,99,0,6,1,99};
		Arrays.sort(a);
		DuplicatesInArray(a);
		
	}

public static void DuplicatesInArray(int a[]) {
	int i,j,length,n;
	ArrayList<Integer> arrL = new ArrayList<Integer>(2);
	length=a.length;
	
		
	for(i=0;i<length;i++) {
		for(j=i+1;j<length;j++) {
			if(a[i]==a[j]) {
				if(!arrL.contains(a[i])) {
					arrL.add(a[i]);
				}
				
			}
		}
	
	}
	
	System.out.println(arrL);	
}
}