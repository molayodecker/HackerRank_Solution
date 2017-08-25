package ALGORITHMS;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		
		int f = lcm(a);
		int l = gcd(b);
		int count =  0;
		for (int i = f, j = 2; i <=l; i = f*j, j++) {
			if(l%i==0){ count++;}
		}
		System.out.println(count);
	}
	
	static int gcd(int a, int b){
		if(b == 0){
			return a;
		}else{
			return gcd(a, a%b);
		}
	}
	
	static int lcm(int a, int b){
		return (a * b )/ gcd(a,b);
	}
	
	static int gcd(int[] array){
		return Arrays.stream(array).reduce(array[0], (a,b) -> gcd(a,b));
	}
	
	static int lcm(int[] array){
		return Arrays.stream(array).reduce(array[0], (a,b) -> lcm(a,b));
	}
}