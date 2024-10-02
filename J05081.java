package jv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Item implements Comparable<Item>{
	private int id;
	private String name;
	private String unit;
	private int buy;
	private int sell;
	
	public Item() {
		
	}
	public Item(int id, String name, String unit, int buy, int sell) {
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.buy = buy;
		this.sell = sell;
	}
	
	public String idIncrease() {
		if (id < 10) return "MH00" + id;
		if (id < 100) return "MH0" + id;
		return "MH" + id;
	}
	
	public int profit() {
		return sell - buy;
	}
	
	public String toString() {
		return idIncrease() + " " + name + " " + unit + " " + buy + " " + sell + " " + profit();
	}
	@Override
	public int compareTo(Item o) {
		return o.profit() - this.profit();
	}

}

public class J05081 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		List<Item> list = new ArrayList<>(t);
		sc.nextLine();
		for (int i = 0 ; i < t ; i ++) {
			String name = sc.nextLine();
			String unit = sc.nextLine();
			int buy = sc.nextInt();
			int sell = sc.nextInt();
			Item p = new Item(i + 1,name,unit,buy,sell);
			sc.nextLine();
			list.add(p);
		}
		Collections.sort(list);
		for (Item i : list) {
			System.out.println(i);
		}
	}
}
