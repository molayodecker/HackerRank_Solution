package General_Package;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = stdin.nextInt();
		}

		for (int i = 0; i < y.length; i++) {
			y[i] = stdin.nextInt();
		}

		int gcd = maximumGcdAndSum(x, y);
		System.out.println(gcd);
	}

	public static int maximumGcdAndSum(int[] A, int[] B) {
		// int max2 = IntStream.range(0, B.length).map(i ->
		// B[i]).max().getAsInt();
		int Asize = A.length;
		int Bsize = B.length;

		int[][] arr = new int[Asize][Bsize];

		for (int i = 0; i < Asize; i++) {
			for (int j = 0; j < Bsize; j++) {
				arr[i][j] = gcd(A[i], B[j]);
			}
		}

		int d1, d2;
		d1 = d2 = 0;

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < Asize; i++) {
			for (int j = 0; j < Bsize; j++) {
				if(arr[i][j]>max){
					max = arr[i][j];
					d1 = A[i];
					d2 = B[j];
				}else if((arr[i][j]==max)&&(A[i]+B[j]>d1+d2)){
					d1 = A[i];
					d2 = B[j];
				}
			}
		}
		
		return d1+d2;
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	// 5
	// 3 1 4 2 8
	// 5 2 12 8 3
}
