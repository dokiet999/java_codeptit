package jv;

import java.util.Scanner;

public class J01010 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		   while(t-- > 0){
			   String s = sc.next();
			   long n = 0;
			   for(int i = 0 ; i < s.length();i++) {
				   char x = s.charAt(i);
				   if(x == '0' || x == '8' || x == '9') {
					   n = n * 10;
				   }else if(x == '1') {
					   n = n * 10 + 1;
				   }else {
					   n = 0;
					   break;
				   }
			   }
			   if(n == 0) {
				   System.out.println("INVALID");
			   }else {
				   System.out.println(n);
			   }
	}
}
}
