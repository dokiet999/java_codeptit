package jv;

import java.util.Scanner;

public class J01006 {
	
	static long fiBo(int n) {
		long first = 0;
		long second = 1;
		while(n > 1) {
			long temp = first + second;
			first = second;
			second = temp;
			n -= 1;
		}
		return second;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int t = ip.nextInt();
		while(t > 0) {
			t--;
			int n = ip.nextInt();
			System.out.println(fiBo(n));
		}
		
	}
}
