package jv;

import java.util.HashMap;
import java.util.Scanner;

public class J03021 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static boolean check(String s) {
		int n = s.length();
		for(int i = 0 ; i < n / 2;i++) {
			char left = s.charAt(i);
			char right = s.charAt(n - 1 - i);
			if (left != right) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-- >0) {
			String s = sc.next().toUpperCase();
			String chartonum = "";
			for(int i = 0 ; i < s.length() ; i++) {
				char c = s.charAt(i);
				int number = c - 0;
				if (number >= 65 && number <= 67) {
					chartonum += '2';
				} else if (number >= 68 && number <= 70) {
					chartonum += '3';
				} else if (number >= 71 && number <= 73) {
					chartonum += '4';
				} else if (number >= 74 && number <= 76) {
					chartonum += '5';
				}else if (number >= 77 && number <= 79) {
					chartonum += '6';
				}else if (number >= 80 && number <= 83) {
					chartonum += '7';
				}else if (number >= 84 && number <= 86) {
					chartonum += '8';
				}else if (number >= 87 && number <= 90) {
					chartonum += '9';
				}
		}
			if (check(chartonum) == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
	}

}
}
