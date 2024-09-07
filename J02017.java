package jv;

import java.util.Scanner;
import java.util.Stack;

public class J02017 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		int n = sc.nextInt();
		while(n-- > 0) {
			int x = sc.nextInt();
			if(!st.empty() && (x + st.peek()) % 2 ==0) {
				st.pop();
			}else {
				st.push(x);
			}
		}
		System.out.println(st.size());
	}

}
