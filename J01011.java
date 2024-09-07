package jv;

import java.util.Scanner;

public class J01011 {
	
	public static Scanner sc = new Scanner(System.in);
	
	static long gcd(long a,long b) {
		if(a == 0) return b;
		
		return gcd(b % a,a);
	}
	static long lcm(long a, long b) {
		return (a*b)/gcd(a,b);
	}

	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-- > 0) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			System.out.println(lcm(a,b)+" "+gcd(a,b));
		}

	}

}
