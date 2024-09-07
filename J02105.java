package jv;

import java.util.Scanner;

public class J02105 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt() + 1;
		int a[][] = new int[n][n];
		for (int i = 1 ; i < n ; i++) {
			for (int j = 1 ; j < n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 1 ; i < n ; i++) {
			System.out.printf("List(%d) = ",i);
			for (int j = 1 ; j < n ; j++) {
				if (a[i][j] == 1) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
