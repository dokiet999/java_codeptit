package jv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03010 {

public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int  t = sc.nextInt();
		sc.nextLine();
		ArrayList<String> arr = new ArrayList<String>();
		while (t-- > 0) {
			String[] s = sc.nextLine().trim().split("\\s+");
			String tmp = s[s.length - 1].toLowerCase();
			for (int i = 0 ; i < s.length - 1; i++) {
				tmp += s[i].substring(0,1).toLowerCase();
			}
			arr.add(tmp);
			int cnt =  Collections.frequency(arr,tmp);
			if (cnt < 2) {
				System.out.printf(tmp + "@ptit.edu.vn");
			} else {
			System.out.printf(tmp + "%d@ptit.edu.vn",cnt);
			}
			System.out.println();
		}
	}
}

