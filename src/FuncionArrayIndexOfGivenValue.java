 //Write a Java program to find the index of an array element.
public class FuncionArrayIndexOfGivenValue {
	public static void main(String[] args) {
		int a[]= {5,49,78,7,8,5,98,6789,7};
		ArrayIndexOfGivenValue(a,1);
		}


public static void ArrayIndexOfGivenValue(int a[],int n) {
	int i,length=a.length,index=-1;
	
	for (i=0;i<length;i++) {
		if(a[i]==n) {
			index=i;
			System.out.println("the index of "+n+" in array is "+index);
		}
		
	}
	if(index == -1){
		System.out.println("Element does not exist in array");
	}
}
}