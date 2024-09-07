package jv;

import java.util.Scanner;

public class J03006 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int n = s.length() - 1;
			boolean flag = false;
			for (int i = 0 ; i < n / 2; i++) {
				char start = s.charAt(i);
				char end = s.charAt(n- i);
				if (start != end || start % 2 != 0) {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}

}
