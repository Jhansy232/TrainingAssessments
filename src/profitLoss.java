import java.util.Scanner;

// If cost price and selling price of an item is input through the
// keyboard, write a program to determine whether the seller has
// # made profit or incurred loss. Also determine how much profit he made or
// loss he incurred.
public class profitLoss {
	public static void main(String[] args) {
		float costPrice,sellingPrice,profit,loss,profitPercentage,lossPercentage;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the costPrice");
		costPrice=sc.nextFloat();
		System.out.println("Enter the sellingPrice");
		sellingPrice=sc.nextFloat();
		if(sellingPrice>costPrice) {
			profit=sellingPrice - costPrice;
			profitPercentage = (profit/costPrice)*100;
			System.out.println("seller got profit of "+profitPercentage);
		}else if(sellingPrice<costPrice) {
			loss=costPrice-sellingPrice;
			lossPercentage = (loss/costPrice)*100;
			System.out.println("seller got loss of "+lossPercentage);
		}else {
			System.out.println("no profit or no loss");
		}
	}
}
