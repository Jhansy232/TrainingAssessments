//Write a Java program to reverse an array of integer values
public class ArrayReverse {
	public static void main(String[] args) {
		int a[]= {8,9,-8,987,90876,7,54,7},temp,i,j,length;
		length=a.length;
		for(i=0;i<length/2;i++) {
			temp=a[i];
			a[i]=a[length-i-1];
			a[length-i-1]=temp;
		}
		for(j=0;j<length;j++) {
			System.out.println(a[j] );
			
		}
	}

}
