package jv;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class J02034 {
	
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] dd = new int[205];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = ip.nextInt();
            max = Math.max(max, x);
            dd[x] = 1;
        }
        boolean excellent = true;
        for (int i = 1; i <= max; i++) {
            if (dd[i] == 0) {
                System.out.println(i);
                excellent = false;
            }
        }
        if (excellent) {
            System.out.println("Excellent!");
        }
    }
}