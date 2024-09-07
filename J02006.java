package jv;

import java.util.Scanner;
import java.util.Arrays;


public class J02006 {
	
	public static Scanner sc = new Scanner(System.in);
	
	static void subset(int a[],int b[],int n,int m) {
		int tmp[] = new int[1001];
		for(int i = 0 ; i < n ; i++) {
			tmp[a[i]] = 1;
		}
		
		for(int j = 0 ; j < m ; j++) {
			if(tmp[b[j]] != 1) {
				tmp[b[j]] = 1;
			}
		}
		for(int i = 0 ; i <= 1000;i++) {
			if(tmp[i] == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i = 0 ; i < n;i++) {
			a[i] = sc.nextInt();
		}
		for(int j = 0 ; j < m;j++) {
			b[j] = sc.nextInt();
		}
		subset(a,b,n,m);
		
	}

}
