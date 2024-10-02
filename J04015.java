package jv;

import java.util.Scanner;

class Income {
	private String id;
	private String name;
	private int money ,bac,phucap;
	
	Income(){
	}
	
	Income(String id , String name , int money){
		this.id = id;
		this.name = name;
		this.money = money;
		
		bac = Integer.parseInt(id.substring(2));
		
		if (id.substring(0,2).equals("HT")) {
			phucap = 2000000;
		} else if(id.substring(0,2).equals("HP")){
			phucap = 900000;
		} else if(id.substring(0,2).equals("GV")) {
			phucap = 500000;
		}
		
	}
	
	public int salary() {
		return money*bac + phucap;
	}
	
	public String toString() {
		return id + " " + name + " " + bac + " " + phucap + " " + salary();
	}
	
}

public class J04015 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String id = sc.nextLine();
		String name = sc.nextLine();
		int money = sc.nextInt();
		Income income = new Income(id , name ,money);
		System.out.println(income);
	}
	
}
