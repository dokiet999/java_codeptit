package jv;

import java.util.Scanner;

public class J02106 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int a[][] = new int[n][3];
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int cnt = 0;
		for (int i = 0 ; i < n ; i++) {
			int cnt1 = 0;
			int cnt0 = 0;
			for (int j = 0 ; j < 3 ; j++) {
				if(a[i][j] == 0) {
					cnt0++;
				}else {
					cnt1++;
				}
			}
			if(cnt1 > cnt0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
