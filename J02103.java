package jv;

import java.util.Scanner;

public class J02103 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			if(n > m) {
				int b[][] = new int[m][m];
			}else {
				int b[][] = new int[n][n]; 
			}
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < m ; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < m ; j++) {
					System.out.print(a[j][i] + " ");
				}
				System.out.println();
			}
			
	}
	}
}


