 //Write a Java program to find the index of an array element.
public class IndexOfArrayElement {
	public static void main(String[] args) {
		int a[]= {5,49,78,7,8,56,98,6789,7};
		int i,length=a.length,index;
		for (i=0;i<length;i++) {
			if(a[i]==7) {
				index=i;
				System.out.println("the index of 7 in array is "+index);
			}
		}
		
		}
}
