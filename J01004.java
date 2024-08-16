package jv;
import java.util.Scanner;

public class J01004 {
	public static Scanner ip = new Scanner(System.in);
	static boolean checkPrime(int x) {
		if(x < 2) {
			return false;
		}
		for(int i = 2 ; i <= (int)Math.sqrt(x);i++) {
			if(x % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String [] args) {
		int t;
		t = ip.nextInt();
		while(t > 0) {
			int n;
			n = ip.nextInt();
			if(checkPrime(n) == true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			t--;
			
			}
		
	}
}
