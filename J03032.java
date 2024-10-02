package jv;

import java.util.StringTokenizer;
import java.util.Scanner;

public class J03032 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = "";
			StringTokenizer str = new StringTokenizer(sc.nextLine());
			while (str.hasMoreTokens()) {
				s = str.nextToken();
				for (int i = s.length() - 1; i >= 0; i--) {
					char c = s.charAt(i);
					System.out.print(c);
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
