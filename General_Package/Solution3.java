package General_Package;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//9
//10 20 20 10 10 30 50 10 20
//10,10,10,10,20,20,20,30,50
//0 ,  ,2 ,  , 4 
public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter Size :");
		final int SIZE = stdin.nextInt();
		int[] arr = new int[SIZE];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter elements :");
			arr[i] = stdin.nextInt();
		} // end of first loop

		sortInsert(arr);
		
		Set<Integer> colors = new HashSet<>();
	    int pairs = 0;
     
	    for (int i = 0; i < arr.length; i++) {
	        if (!colors.add(arr[i])) {
	            pairs++;
	            colors.remove(arr[i]);
	        }
	    }

	    System.out.println(pairs);
//	    
//		 for (int i = 0; i < arr.length; i++) {
//		 System.out.println(arr[i]);
//		 }

		// System.out.println(counter);
		// System.out.println("if " + arr[i] + " == " + arr[i + 2]);
//		int pointer = 1;
//		for (int i = 0; i < arr.length - 1; i = i + 2) {
//			System.out.println(counter);
//			System.out.println("if " + i + " == " + (pointer));
//			System.out.println("if " + arr[i] + " == " + arr[pointer]);
//			if (arr[i] == arr[i + 1] && i != arr.length ) {
//				counter++;
//				pointer += 2;
//			}
//		} // end of second loop
//
//		System.out.println(counter);
	}


	public static int[] sortInsert(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int hole = i;
			while (hole > 0 && arr[hole - 1] > temp) {
				arr[hole] = arr[hole - 1];
				hole = hole - 1;
			}
			arr[hole] = temp;
		}
		return arr;
	}
	


}
