package jv;

import java.util.Scanner;

public class J02008 {
	
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
			int n = sc.nextInt();
			long res = 1;
			for(int i = 2 ; i <= n ; i++) {
				res = lcm(res,i);
				System.out.println(res);
			}
	}

}
}
