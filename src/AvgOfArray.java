// Write a Java program to calculate the average value of array elements.
public class AvgOfArray {
	public static void main(String[] args) {
		int a[]= {6,9,0,4,5,34,-4,-6};
		int sum=0,length=a.length,i;
		float Avg;
		for (i=0;i<length;i++) {
			sum= sum+a[i];
		}
		Avg=(float)sum/(float)length;
		System.out.println(Avg);
		
	}
}
