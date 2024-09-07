package jv;

import java.util.Scanner;

public class J02007 {
	
	public static Scanner sc = new Scanner(System.in);
	
	static void count(int t) {
		    int n = sc.nextInt();
	        int[] a = new int[n];
	        int[] dd = new int[100005];

	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	            dd[a[i]]++;
	        }
	        System.out.printf("Test %d:\n", t);
	        for (int i = 0 ; i < n ; i++) {
	        	if (dd[a[i]] > 0) {
	        		System.out.printf("%d xuat hien %d lan\n", a[i], dd[a[i]]);
	        		dd[a[i]] = 0;
	        	}
	        }
	}

	public static void main(String[] args) {
		int t = sc.nextInt();
		for (int i = 1 ; i <= t ; i++) {
			count(i);
		}
	}

}
