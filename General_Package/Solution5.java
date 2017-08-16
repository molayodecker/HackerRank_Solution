package General_Package;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter Letter/Word :");
		String s = in.next();
		System.out.print("Enter digit :");
		long n = in.nextLong();
        long as = s.chars().filter(c -> c == 'a').count();
        long times = n/s.length();
        long rest  = n - times * s.length();
        long totalAs = times * as + s.substring(0, (int) rest).chars().filter(c -> c == 'a').count();
        System.out.println(totalAs);
	}
}