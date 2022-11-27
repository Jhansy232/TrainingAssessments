// Write a Java program to test if an array contains a specific value.
public class FunctionValueInArray {
	public static void main(String[] args) {
	int a[]= {5,9,7,7,8,56,9,9,9,980,6789};
	ValueInArray(a,1);
	}

public static void ValueInArray(int a[],int n) {
	int i,length=a.length,sum=0;
	for (i=0;i<length;i++) {
		if(a[i]==n) {
			sum=sum+1;
		}
	}
	if (sum==0) {
		System.out.println("The array does not contain the value " +n);
	}
	else {
		System.out.println("The array contains "+n+","+"'"+sum+"'"+" times");
		
	}
	
}

}

