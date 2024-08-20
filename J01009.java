package jv;

import java.util.Scanner;

public class J01009 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		byte n = sc.nextByte();
		long sumOfFactorial = 0;
		long factorial = 1;
		for(int i = 1 ; i <= n ; i++) {
			factorial *= i;
			sumOfFactorial += factorial;
		}
		System.out.println(sumOfFactorial);
	}

}
