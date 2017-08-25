package THIRTYDAYSOFCODE;

import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);

		int n = stdin.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = stdin.next();
		}

		for (String string : str) {
			System.out.println(oddeven(string));
		}

	}

	public static String oddeven(String str) {
		String even = "", odd = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				even += str.charAt(i);
			} else {
				odd += str.charAt(i);
			}
		}
		return even + " " + odd;
	}

}
