package jv;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			System.out.println(a.gcd(b));
		}

	}

}
