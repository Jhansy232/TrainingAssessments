// Write a Java program to test if an array contains a specific value.
public class FindingValueInArray {
	public static void main(String[] args) {
	int a[]= {5,9,7,7,8,56,980,6789};
	int i,length=a.length,sum=0;
	for (i=0;i<length;i++) {
		if(a[i]==7) {
			sum=sum+1;
		}
	}
	if (sum==0) {
		System.out.println("The array does not contain the value 7");
	}
	else {
		System.out.println("The array contains 7, " +"'"+sum+"'"+" times");
		
	}
	}
}
