package jv;

import java.util.Scanner;

class tuyenSinh {
	private String msv;
	private String name;
	private float diem1;
	private float diem2;
	private float diem3;

	public tuyenSinh(String msv, String name, float diem1, float diem2, float diem3) {
		this.msv = msv;
		this.name = name;
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}

	public float diemKv() {
		String x = msv.substring(0, 3);
		if (x.equals("KV1"))
			return (float) 0.5;
		if (x.equals("KV2"))
			return (float) 1.0;
		return (float) 2.5;
	}

	public float tongDiem() {
		float res= diem1 * 2 + diem2 + diem3;
		return res;
	}

	public String check() {
		if (tongDiem() + diemKv() < 24) {
			return "TRUOT";
		}
		return "TRUNG TUYEN";
	}
	 public String formatFloat(float x) {
	        int xInt = (int) (x * 10);
	        return xInt % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
	    }
	public String toString() {
		 return msv + " " + name + " " + formatFloat(diemKv()) + " " +formatFloat(tongDiem()) + " " + check();
	}
}

public class J04013 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String msv = sc.nextLine();
		String name = sc.nextLine();
		float diem1 = sc.nextFloat();
		float diem2 = sc.nextFloat();
		float diem3 = sc.nextFloat();
		tuyenSinh tuyensinh = new tuyenSinh(msv,name,diem1,diem2,diem3);
		System.out.println(tuyensinh);
	}
}
