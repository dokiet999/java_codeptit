package jv;

import java.util.Scanner;

public class J02013 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0 ; i < n ; i ++) {
			a[i] = sc.nextInt();
		}
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
            System.out.printf("Buoc %d: ",i + 1);
            for(int it = 0 ; it < n ; it ++) {
            	System.out.print(a[it] + " ");
            }
            System.out.println();
        }
	}

}
