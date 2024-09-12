package jv;

import java.util.Scanner;

public class J03025 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int n = s.length();
			boolean flag = false;
			int cnt = 0;
			for (int i = 0 ; i < n/2 ; i++) {
				char left = s.charAt(i);
				char right = s.charAt(n - 1 - i);
				if (left != right) {
					cnt++;
				} 
			}
			 if ((n % 2 == 0 && cnt == 1) || (n % 2 == 1 && cnt <= 1)) {
	                System.out.println("YES");
	            } else {
	                System.out.println("NO");
	            }
		}

	}

}
