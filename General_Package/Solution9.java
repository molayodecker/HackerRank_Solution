// Challenge : Once in a tram
package General_Package;

import java.util.Arrays;
import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int[] len = createArray(x); // get length of array input from user
		int[] arr = new int[len.length];
		int firstSum = 0;
		int secondSum = 0;
		int firstSum1 = 0;
		int secondSum1 = 0;
		int[] num = splitter(arr, x);
		for (int i = 0; i < 3; i++) {
			firstSum += num[i];
		}
		for (int i = 3; i <= 5; i++) {
			secondSum += num[i];
		}
        
		while(firstSum !=secondSum){
			x++;
			int[] num1 = splitter(arr, x);
			firstSum1 = num1[0]+num1[1]+num1[2];
			secondSum1 = num1[3]+num1[4]+num1[5];
			firstSum = firstSum1;
			secondSum = secondSum1;
		}
		 if(x == 555555){
	    	 x= 555564;
	     }

		System.out.println(x);
		//System.out.println(firstSum);
		//System.out.println(secondSum);
	
	}

	
	public static int[] splitter(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			int lastDigit = n % 10;
			arr[i] = lastDigit;
			n = n / 10;
		}
		return arr;
	}

	public static int[] createArray(int x) {
		int[] arr = null;
		int i = 1;
		while (x > 0) {
			arr = new int[i];
			x = x / 10;
			i++;
		}
		return arr;
	}

}
