package jv;

import java.util.Scanner;

public class J01008 {
	
	public static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		int T = sc.nextInt();
        for (int loop = 1; loop <= T; loop++) {
			int N = sc.nextInt();
			int n = N;
			System.out.printf("Test %d: ", loop);
			for (int i = 2; i <= Math.sqrt(N); i++) {
	            int cnt = 0;
	            while (n % i == 0) {
	                cnt++;
	                n /= i;
	            }
	            if (cnt != 0) {
	                System.out.printf("%d(%d) ", i, cnt);
	            }
	        }
	        if (n != 1) {
	            System.out.printf("%d(%d) ", n, 1);
	        }
	        System.out.println();
        }
	}

}

