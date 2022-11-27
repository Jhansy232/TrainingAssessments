//write a program to sum the value of the array
public class FunctionSumOfArray {
	public static void main(String[] args) {
		int a[]= {5,9,7,7,8};
		int sum;
		float average;
		sum=SumOfArray(a);
		System.out.println(sum);
		average=AvgOfArray(a);
		System.out.println(average);
	}



public static int SumOfArray(int a[]) {
	int sum=0,lenth=a.length,i;
	for(i=0;i<lenth;i++) {
		sum=sum+a[i];
	}
	return sum;
}

public static float AvgOfArray(int a[]) {
	int sum=0,lenth=a.length,i;
	float avg;
	for(i=0;i<lenth;i++) {
		sum=sum+a[i];
	}
	avg=(float)sum/(float)lenth;
	return avg;
}
}