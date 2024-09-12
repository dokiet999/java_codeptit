package jv;

import java.util.Scanner;

public class J03007 {
	
	public static Scanner sc = new Scanner(System.in);

	public static int tong(String s) {
		int sum = 0;
		for(int i = 0 ; i < s.length();i++) {
			char c = s.charAt(i);
			sum += c - '0';
		}
		return sum;
		
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
				char cuoi = s.charAt(n);
				if (start != end || cuoi != '8') {
					flag = true;
					break;
				}
			}
			if (flag == false && tong(s) % 10 == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
