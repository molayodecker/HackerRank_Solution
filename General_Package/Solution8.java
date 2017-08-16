package General_Package;

import java.util.Scanner;

public class Solution8 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = ((s-1) +(m-1))% n+1;
            System.out.println(result);
        }
    }

}
