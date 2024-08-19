package jv;

import java.util.Scanner;

public class J01003 {

	public static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		if(a >= 0 && b > 0) {
			System.out.print("VN");
		}else if(b == 0){
			System.out.print("VSN");
		}else {
			System.out.print(String.format("%.2f",-b/a));
		}
	}
}
