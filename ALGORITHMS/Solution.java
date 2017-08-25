package ALGORITHMS;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Size :");
		int n = in.nextInt();
		int[] types = new int[n];
		for (int types_i = 0; types_i < n; types_i++) {
			System.out.print("Numbers :");
			types[types_i] = in.nextInt();
		}
		int smallest1 = 0;
		int smallest2 = 0;
		// 1 4 4 4 5 3
		// 1 4 4 7 4 1
		for (int i = 0; i < types.length - 1; i++) {
			if (types[i] > smallest1 && types[i] == types[i + 1]) {
				smallest1 = types[i];
			} // end of if
		} // end of first for loop
			// System.out.println(smallest1);

		int shift = types.length - 1;
		for (int j = 0; j < types.length - 1; j++) {
			if (types[j] < smallest1 && types[j] == types[shift] || shift != 0) {
					smallest2 = types[j];
			}
			shift--;
		} // end of second for loop
			// 4 < 1 || 1
		if (smallest1 < smallest2) {
			System.out.println(smallest1);
		} else {
			System.out.println(smallest2);
		} // end of if

	}// end of main

}
