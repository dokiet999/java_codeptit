package jv;

import java.util.Scanner;

class sumFraction {
	private long a, b, c, d;

	sumFraction() {
		a = 0;
		b = 1;
		c = 0;
		d = 1;
	}

	sumFraction(long a, long b, long c, long d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	private long gcd(long a, long b) {
		while (b != 0) {
			long z = a % b;
			a = b;
			b = z;
		}
		return a;
	}

	public String toString() {
		long p = a * d;
		long q = c * b;
		long x = p + q;
		long y = b * d;
		long g = gcd(x,y);
		return (x / gcd(x,y) + "/" + y / gcd(x,y));
	}
}

public class J04004 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		sumFraction sumF = new sumFraction(a, b, c, d);
		System.out.println(sumF);
	}
}
