package jv;

import java.util.Scanner;

public class J03008 {
	
	public static Scanner sc = new Scanner(System.in);

	public static boolean isPrime(int s) {
		if(s < 2) return false;
		for(int i = 2 ; i <= Math.sqrt(s); i++) {
			if(s % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int n = s.length() - 1;
			boolean flag = false;
			int sum = 0;
			for (int i = 0 ; i < n / 2; i++) {
				char start = s.charAt(i);
				char end = s.charAt(n- i);
				if (start != end || isPrime(start - '0') == false) {
					flag = true;
					break;
				}
			}
			if (flag == false ) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
