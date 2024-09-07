package jv;

import java.util.Scanner;

public class J02014 {
	
	public static Scanner sc = new Scanner(System.in);

	static int indexBalance(int a[], int n) {
	    int sumRight = 0;
	    for (int i = 1; i < n; i++) {
	        sumRight += a[i];
	    }

	    int sumLeft = a[0];
	    for (int index = 1; index < n - 1; index++) {
	        sumRight -= a[index];        
	        if (sumLeft == sumRight) {
	            return index + 1;
	        }        
	        sumLeft += a[index];
	    }
	    return -1;
	}


	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();	
			}
			System.out.println(indexBalance(a,n));
		}

	}

}
