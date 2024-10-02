package jv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Students {
	private int id;
	private String name;
	private String classroom;
	private String dateOBirth;
	private float gpa;

	public Students() {
		id = 0;
		name = classroom = dateOBirth = "";
		gpa = 0;
	}

	public Students(int id, String name, String classroom, String dateOBirth, float gpa) {
		this.id = id;
		this.name = name;
		this.classroom = classroom;
		this.dateOBirth = dateOBirth;
		this.gpa = gpa;
	}

	public String msv() {
		if (id < 10) {
			return "B20DCCN00" + id;
		}
		return "B20DCCN0" + id;
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
		return msv() + " " + name + " " + classroom + " " + formatDate() + " " + gpa;
	}

}

public class J05003 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		sc.nextLine();
		Students[] students = new Students[n];
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			String classroom = sc.nextLine();
			String dateOBirth = sc.nextLine();
			float gpa = sc.nextFloat();
			sc.nextLine();
			students[i] = new Students(i + 1, name, classroom, dateOBirth, gpa);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(students[i]);
		}
	}
}
