package ALGORITHMS;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

//6 3
//1 3 2 6 1 2

public class Solution6 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the Nth Number :");
		int n = stdin.nextInt();
		System.out.print("Enter the Kth Number :");
		int k = stdin.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the number into Array :");
			arr[i] = stdin.nextInt();
		}
		int i = 0;
		int j = 0;
		int clock = 0;
		int counter = 0;
		while (clock != arr.length) {
			for (j = i+1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) % k == 0) {
					//System.out.println(arr[i] + " + " + arr[j]);
					counter++;
				} else {
					continue;
				}
			}
			clock++;
			i++;
		}
		
		System.out.println(counter);
	}
}
