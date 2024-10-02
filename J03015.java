package jv;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			BigInteger c = a.subtract(b);
			System.out.println(c.toString());
	        
		}
	}


