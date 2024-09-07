package jv;

import java.util.Scanner;

public class J01021 {
	
	public static long modulo = 1000000007;
	
	public static Scanner sc = new Scanner(System.in);
	
	 public static long power(long a, long b){
	        if (b == 0)
	            return 1;
	        if (b == 1) return a % modulo;
	        long temp = power(a, b / 2);
	        if (b % 2 == 0) {
	            return (temp * temp) % modulo;
	        }
	                return (((temp * temp)) % modulo * a) % modulo;
	        
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
				long a = sc.nextLong();
				long b = sc.nextLong();
				if(a == 0 && b == 0) break;
				System.out.println(power(a,b));		
		}
	}

}
