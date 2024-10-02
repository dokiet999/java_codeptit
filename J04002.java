package jv;

import java.util.Scanner;

class Rectange {
	double width;
	double height;
	String color;

	public Rectange() {
		this.width = 1;
		this.height = 1;
	}

	public Rectange(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public String getColor() {
		return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
	}

	double findArea() {
		return width * height;
	}

	double findPerimeter() {
		return (width + height) * 2;
	}
    public String toString() {
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
}

public class J04002 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double height = sc.nextDouble();
		double width = sc.nextDouble();
		String color = sc.next();
		if (height < 0 && width < 0) {
			System.out.println("INVALID");
		} else {
			String s = "";
			Rectange a = new Rectange(height, width, color);
			System.out.println(a);
		}
	}
}
