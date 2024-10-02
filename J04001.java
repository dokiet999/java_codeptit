package jv;

import java.util.Scanner;

class Point {
	private double x;
	private double y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	double distance(Point p) {
		return Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
	}

	double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
	}
	
	public String toString() {
		return x + " " + y;
	}
}

public class J04001 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			Point a = new Point(x,y);
			x = sc.nextDouble();
			y = sc.nextDouble();
			Point b = new Point(x,y);
			System.out.printf("%.4f",a.distance(b));
			System.out.println();
		}
	}
	
}
