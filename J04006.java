package jv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Studentss {
	private String name, room, date;
	private float point;

	Students() {
		name = room = date = " ";
		point = 0;
	}
	Students(String name, String room , String date, float point){
		this.name = name;
		this.room = room;
		this.date = date;
		this.point = point;
	}
	
	 public String formatDate() {
	        try {
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            Date dob = formatter.parse(date);
	            return formatter.format(dob);
	        } catch (ParseException e) {
	            System.out.println(e);
	        }
	        return "";
	    }

	public String toString() {
		return "B20DCCN001" + " " + name + " " + room + " " + formatDate() + " " + String.format("%.2f", point);
	}

}

public class J04006 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String name = sc.nextLine();
		String room = sc.nextLine();
		String date = sc.nextLine();
		float point = sc.nextFloat();
		Students student = new Students(name,room,date,point);
		System.out.println(student);
	}
}

