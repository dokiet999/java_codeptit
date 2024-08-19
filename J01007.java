package jv;

import java.util.Scanner;

public class J01007 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static long[] fibonacci = new long[100];
	
	public static void initialize() {
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for(int i = 2 ; i < 100 ; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
	}
	
	public static boolean checkFibo(long n) {
		for(long i : fibonacci) {
			if(i == n) {
			return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		initialize();
		while(t-- > 0) {
			long n = sc.nextLong();
			if(checkFibo(n)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		
	}
}
