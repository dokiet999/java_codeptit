package jv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {

	public static void main(String[] args) throws FileNotFoundException {
		File myfile = new File("DATA.in");
		Scanner sc = new Scanner(myfile);
		int dd[] = new int[100000];
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.next());
			dd[n]++;
		}
		for (int i = 0; i < 1000; i++) {
			if (dd[i] > 0) {
				System.out.printf("%d %d\n", i, dd[i]);
			}
		}
	}
}