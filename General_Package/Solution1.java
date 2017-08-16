package General_Package;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter size");
		int n = stdin.nextInt();
		System.out.println("Enter index to Charge");
		int index = stdin.nextInt();
		int[] k = new int[n];
		int actualCost = 0;
		int temp = 0;
		for (int i = 0; i < k.length; i++) {
			temp = k[index];
			System.out.println("Enter elements");
			k[i] += stdin.nextInt();
		} // end of for loop

		for (int i : k) {
			actualCost += i;
		}
		
        System.out.println(actualCost);
		actualCost -= temp;
		System.out.println("Enter Amount charged");
		int amtCharge = stdin.nextInt();
		
		int avg  = (actualCost)/2;
		System.out.printf("The average is %d", avg);
		int total = 0;
		
		if(amtCharge != avg){
		 total = amtCharge - avg;
		 System.out.println(total);
		}
		
		if(amtCharge == avg){
			System.out.println("Bon Appetit");
		}
	}
	
}
