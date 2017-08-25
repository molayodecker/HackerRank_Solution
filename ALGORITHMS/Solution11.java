package ALGORITHMS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

//7 3
//1 2 4 5 7 8 10
//1-3 1-2*3 = -2 && -3
//2-3 3-2*3 = -1 &&  3
//4-3 4-2*3 =  1 &&  6
//5-3 5-2*3 =  3 &&  6
//7-3 7-2*3 =  4 && 15
//8-3 8-2*3 =  5 && 18
//10-3 10-2*3 = 7 && 24
public class Solution11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int d = scan.nextInt();
		ArrayList<Integer> element = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			element.add(scan.nextInt());
		}
		int in = beautifulTriplets(element, size, d);
		System.out.print("The Answer is");
		System.out.println(in);

	}

	public static int beautifulTriplets(ArrayList<Integer> e, int size, int d) {
		int count = 0;
		for (Integer obj : e) {
			if (e.contains(obj + d) && e.contains(obj + 2 * d)) {
				count++;
			}
		}
		return count;
	}
}
