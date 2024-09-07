package jv;

import java.util.Scanner;

public class J02104 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt() + 1;
		int a[][] = new int[n ][n ];
		for(int i = 1 ; i < n ; i++) {
			for(int j = 1 ; j < n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 1 ; i < n ; i++) {
			for(int j = i +1   ; j < n ; j++) {
				if(a[i][j] == 1) {
					System.out.printf("(%d,%d)",i,j);
					System.out.println();
					System.out.println();
				}
			}
		}
	}

}
