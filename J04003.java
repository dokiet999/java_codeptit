package jv;

import java.util.Scanner;

class fraction {
	private long a;
	private long b;

	fraction() {
		a = 0;
		b = 1;
	}

	fraction(long a, long b) {
		this.a = a;
		this.b = b;
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
		long g = gcd(this.a, this.b);
		return a / g + "/" + b / g;
	}

}

public class J04003 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long a = sc.nextLong();
		long b = sc.nextLong();
		fraction frac = new fraction(a, b);
		System.out.println(frac);
	}
}
