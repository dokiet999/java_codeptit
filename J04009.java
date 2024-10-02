package jv;

import java.util.Scanner;

class Point {
	private double x;
	private double y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	double distance(Point p) {
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
	}

}

public class J04009 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			Point[] point = new Point[3];
			for (int i = 0; i < 3; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				point[i] = new Point(x, y);
			}
			double a = point[0].distance(point[1]);
			double b = point[1].distance(point[2]);
			double c = point[2].distance(point[0]);

			if (a + b > c && b + c > a && a + c > b) {

				double S = 1 / 4f * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
				System.out.printf("%.2f\n", S);
			} else {
				System.out.println("INVALID");
			}

		}
	}
}
