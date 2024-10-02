package jv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
	private int hour;
	private int minute;
	private int second;

	public Time() {

	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public String toString() {
		return hour + " " + minute + " " + second;
	}

	@Override
	public int compareTo(Time o) {
		int s1 = hour * 3600 + minute * 60 + second;
		int s2 = o.getHour() * 3600 + o.getMinute() * 60 + o.getSecond();
		return s1 - s2;
	}
}

public class J05033 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		List<Time> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			Time time = new Time(h, m, s);
			list.add(time);
		}
		Collections.sort(list);
		for (Time i : list) {
			System.out.println(i);
		}
	}
}