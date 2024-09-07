package jv;

import java.util.Scanner;

public class J02012 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0 ; i < n ;i++) {
			int j = i;
			while (j > 0 && a[j] < a[j - 1]) {
				int tmp = a[j - 1];
				a[j - 1] = a[j];
				a[j] = tmp;
				j--;
			}
			System.out.printf("Buoc %d: " , i);
			for (int it = 0 ; it <= i ; it++) {
			System.out.printf(a[it] + " ");
			}
			System.out.println();
		}
		
	}

}
