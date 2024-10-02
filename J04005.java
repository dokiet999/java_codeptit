package jv;

import java.util.Scanner;

class Student {
	private String name;
	private String date;
	private float point1;
	private float point2;
	private float point3;

	Student() {
		name = "";
		date = "";
		point1 = 0;
		point2 = 0;
		point3 = 0;
	}

	Student(String name, String date, float point1, float point2, float point3) {
		this.name = name;
		this.date = date;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	public String toString() {
		return name + " " + date + " " + (point1 + point2 + point3);
	}
}

public class J04005 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String name = sc.nextLine();
		String date = sc.next();
		float point1 = sc.nextFloat();
		float point2 = sc.nextFloat();
		float point3 = sc.nextFloat();
		Student student = new Student(name,date,point1,point2,point3);
		System.out.println(student);
	}
}
