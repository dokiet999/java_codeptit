package jv;

import java.util.Scanner;

public class J02011 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0 ; i < n - 1 ; i ++) {
			int min = i;
			for (int j = i + 1 ; j < n ; j++) {
					if (a[j] < a[min]) {
						min = j;
					}		
			}
			int tmp = a[i];
			a[i] = a[min];
			a[min] = tmp;
			System.out.printf("Buoc %d: ",i + 1);
			for (int it = 0 ; it < n ; it ++) {
				System.out.print(a[it] + " ");
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
