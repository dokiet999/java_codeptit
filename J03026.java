package jv;

import java.util.Scanner;

public class J03026 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			String a = sc.next();
			String b = sc.next();
			 System.out.println(a.equals(b) ? -1 : Math.max(a.length(), b.length()));
		}
	}
	
}
