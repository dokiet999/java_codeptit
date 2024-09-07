package jv;

import java.util.Scanner;

public class J02101 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			for (int i = 0 ; i < n ; i++) {
				for (int j = 0 ; j < n ; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int cnt = 0;
			boolean pino = true;
			while(cnt != n ) {
				if(pino == true) {
					for(int i = 0 ; i < n ; i++) {
						System.out.print(a[cnt][i] + " ");
					}
					pino = false;
					cnt++;
				}
				else {
					for(int i = n -1 ; i >= 0; i-- ) {
						System.out.print(a[cnt][i] + " ");
					}
					pino = true;
					cnt++;
				}
			}
			System.out.println();
		}

	}

}
