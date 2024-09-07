package jv;

import java.util.Scanner;

public class J01013 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 1 ; i <= n ; i++) {
			long N = sc.nextLong();
			long pino = N;
			int temp = 0;
			long x = N;
			for(int j = 2 ; j <= Math.sqrt(pino);j++) {
				while(N % j == 0) {
					cnt += j;
					temp ++;
					N /= j;
				}
			}
			if(temp == 0) {
				cnt += x;
			}
			System.out.println(cnt);
		}
		System.out.println(cnt);
	}

}
