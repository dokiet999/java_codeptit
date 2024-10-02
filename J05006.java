package jv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Employees {
	public static int NUM = 1;
	private String id;
	private String name;
	private String sex;
	private String dateOBirth;
	private String address;
	private String tax;
	private String contractDay;

	public Employees(String name, String sex, String dateOBirth, String address, String tax, String contractDay) {
		this.id = String.format("%05d", NUM++);
		this.name = name;
		this.sex = sex;
		this.dateOBirth = dateOBirth;
		this.address = address;
		this.tax = tax;
		this.contractDay = contractDay;
	}

	public String formatContract() {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date dob = formatter.parse(contractDay);
			return formatter.format(dob);
		} catch (ParseException e) {
			System.out.println(e);
		}
		return "";
	}

	public String formatDate() {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date dob = formatter.parse(dateOBirth);
			return formatter.format(dob);
		} catch (ParseException e) {
			System.out.println(e);
		}
		return "";
	}

	public String toString() {
		return id + " " + name + " " + sex + " " + formatDate() + " " + address + " " + tax + " " + formatContract();
	}

}

public class J05006 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		sc.nextLine();
		Employees[] employees = new Employees[n];
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			String sex = sc.nextLine();
			String dateOBirth = sc.nextLine();
			String address = sc.nextLine();
			String tax = sc.nextLine();
			String contractDay = sc.nextLine();
			employees[i] = new Employees(name, sex, dateOBirth, address, tax, contractDay);
			System.out.println(employees[i]);
		}
	}
}
