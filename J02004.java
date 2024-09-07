package jv;

import java.util.Scanner;

public class J02004 {
	
	public static Scanner sc = new Scanner(System.in);
	
	static void isSymmetric(long[] a, int n) {
		int first = 0;
		int last = n - 1;
		boolean flag = true;
		while(first <= last) {
			if(a[first] != a[last]) {
				flag = false;
				break;
			}else {
				first++;
				last--;
			}
		}
		if(flag == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			long a[] = new long[n];
			for(int i = 0 ;i < n ; i++) {
				a[i] = sc.nextLong();
			}
			isSymmetric(a,n);
		}
	}

}
