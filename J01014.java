package jv;

import java.util.Scanner;

public class J01014 {
	
	public static Scanner sc = new Scanner(System.in);
	
	static boolean isPrime(long n) {
		if (n < 2) return false;
		for (int i = 2 ; i <= Math.sqrt(n);i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			long temp = 0;
			long n = sc.nextLong();
			for (int i = 1 ; i <= Math.sqrt(n) ; i++) {
				if (n % i == 0) {
					if (isPrime(n/i)) {
						temp = n/i;
						break;
					}if (isPrime(i)) {
						temp = i;
					}
				}
			}
			System.out.println(temp);
		}
			}
}
