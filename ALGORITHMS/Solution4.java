package ALGORITHMS;

import java.util.HashSet;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = turn(8, 4);
		System.out.println(value);
	}

	public static int turn(int n, int p) {
		int turns = 0;
		int halves = n/2;
		if(p > halves){ //When p is not greater than the number of pages divided by 2 move to else
			int rev = n - p;
			if (rev > 1) {
	            turns = rev/2;
	        }
		}else {
			if(p>1){
				turns = p/2;
			}
		}
		
		return turns;	
	}

}

