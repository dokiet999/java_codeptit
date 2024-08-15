package jv;
import java.util.*;

public class J01002 {
	public static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
	int t = ip.nextInt();
	while(t > 0) {
		t -= 1;
		int n = ip.nextInt();
		System.out.println(n*(n+1)/2);
	}
	}
}

