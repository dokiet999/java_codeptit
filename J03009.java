package jv;

import java.util.HashSet;
import java.util.Scanner;

public class J03009 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t =  Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
		String[] a = sc.nextLine().split("\\s+");
		String[] b = sc.nextLine().split("\\s+");
		HashSet<String> c = new HashSet<String>();
		for(String i : a) {
			c.add(i);
		}
		HashSet<String> d = new HashSet<String>();
		for(String i : b) {
			d.add(i);
		}
		c.removeAll(d);
		for(String i : c) {
			System.out.print(i + " ");
		}
		System.out.println();
		}
	}

}
