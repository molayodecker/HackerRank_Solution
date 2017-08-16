package General_Package;

import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int first = stdin.nextInt();
		int second = stdin.nextInt();
		int k = stdin.nextInt();
		int x = 0;
		int i = 0;
		int counter = 0;
		int reverse = 0;
		for (int a= first; a <= second; a++) {
			x = a;
			while (x != 0) {
				reverse = reverse * 10;
				reverse = reverse + x % 10;
				x = x/10;
			}

		 if(Math.abs(a - reverse) % 6 ==0){
			 counter++;
			 reverse = 0;
		 }
		}
		
		System.out.println(counter);
	}
	
	

//	public static int reverseInt(int arr) {
//		int reverse = 0;
//		while (arr != 0) {
//			reverse = reverse * 10;
//			reverse = reverse + arr % 10;
//			arr = arr/10;
//		}
//		return reverse;
//	}
}

 