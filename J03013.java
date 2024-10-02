package jv;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			BigInteger c = a.subtract(b).abs();
			StringBuilder sb = new StringBuilder(c.toString());
	            int maxLen = Math.max(a.toString().length(), b.toString().length());
	            while (sb.length() < maxLen) {
	                sb.insert(0, '0');
	            }
	            System.out.println(sb.toString());
	        }
		}
	}


