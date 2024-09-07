package jv;

import java.util.Scanner;

public class J01026 {
	
	public static Scanner sc = new Scanner(System.in);
	
	static void isSquareNum(long n) {
		int tmp = (int) (Math.sqrt(n));
		if (tmp * tmp == n){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			isSquareNum(n);
		}	
	}

}
