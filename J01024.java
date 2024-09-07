package jv;

import java.util.Scanner;

public class J01024 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			boolean flag = true;
			for (int i = 0; i < s.length();i++) {
				char c = s.charAt(i);
				if (c != '0' && c != '1' && c != '2') {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
