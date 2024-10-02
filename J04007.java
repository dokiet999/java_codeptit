package jv;

import java.util.Scanner;

class Employee {
	private String name, sex, date, address, contract;
	private String tax;

	Employee() {
		name = sex = date = address = contract = "";
		tax = " ";
	}

	Employee(String name, String sex, String date, String address, String tax ,String contract) {
		this.name = name;
		this.sex = sex;
		this.date = date;
		this.address = address;
		this.contract = contract;
		this.tax = tax;
	}

	public String toString() {
		return "00001" + " " + name + " " + sex + " " + date + " " + address + " " + tax + " " + contract;
	}

}

public class J04007 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String name = sc.nextLine();
		String sex = sc.nextLine();
		String date = sc.nextLine();
		String address = sc.nextLine();
		String tax = sc.nextLine();
		String contract = sc.nextLine();
		Employee employee = new Employee(name,sex,date,address,tax,contract);
		System.out.println(employee);
	}
}

