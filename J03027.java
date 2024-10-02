package jv;

import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = sc.next();
        int n = s.length();
        int i = 0;
        
        while (i < n) {
            char c = s.charAt(i); 
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c); 
            }
            i++;
        }
        if (!st.empty()) {
        	String ans = "";
        	for(char c : st) {
        		ans += c;
        	}
        	System.out.println(ans);
        } else {
        	System.out.println("Empty String");
        }
    }
}
