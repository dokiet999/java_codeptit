package jv;

import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class J02005 {
	
	public static Scanner sc = new Scanner(System.in);
	
	static void subset(int a[],int b[],int n,int m) {
		int tmp[] = new int[1001];
		for(int i = 0 ; i < n ; i++) {
			tmp[a[i]] = 1;
		}
		Arrays.sort(b);
		for(int j = 0 ; j < m ; j++) {
			if(tmp[b[j]] == 1) {
				System.out.print(b[j] + " ");
				tmp[b[j]]++;
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
