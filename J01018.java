package jv;

import java.util.Scanner;

public class J01018 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		while(t-- > 0) {
			String s = sc.next();
			boolean flag = true;
			int sum = s.charAt(0) + '0' - 96;
			for(int i = 0 ; i < s.length() - 1 ;i++) {
				char s1 = s.charAt(i);
				char s2 = s.charAt(i + 1);
				sum += (s2 + '0') -96;
				int subtract = Math.abs((s1 - '0') - (s2 - '0'));
				if(subtract != 2) {
					flag = false;
					break;
				}
			}
			if(flag == true && sum % 10 == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}

	}
	}

}
