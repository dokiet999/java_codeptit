package jv;

import java.util.Scanner;

public class J03024 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int countEven = 0;
			int countOdd = 0;
			boolean flag = false;
			for (int i = 0 ; i < s.length();i++) {
				char x = s.charAt(i);
				int c = x - '0';
				if (c < 10) {
					if (c % 2 == 0) {
						countEven++;
					} else {
						countOdd++;
					}
				} else {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				System.out.println("INVALID");
			} else {
				if (countEven > countOdd) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}

	}

}
