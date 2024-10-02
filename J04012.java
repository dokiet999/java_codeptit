package jv;

import java.util.Scanner;

class tinhCong {
	private String name;
	private int luongCoBan;
	private int ngayCong;
	private String chucVu;

	public tinhCong(String name, int luongCoBan, int ngayCong, String chucVu) {
		this.name = name;
		this.luongCoBan = luongCoBan;
		this.ngayCong = ngayCong;
		this.chucVu = chucVu;
	}

	public int thuongPhuCap() {
		if (chucVu.equals("GD") == true)
			return 250000;
		else if (chucVu.equals("PGD") == true)
			return 200000;
		else if (chucVu.equals("TP") == true)
			return 180000;
		return 150000;
	}

	public int luongThang() {
		return ngayCong * luongCoBan;
	}

	public int thuongNgayCong() {
		if (ngayCong >= 25)
			return (int) (luongThang() * 0.20);
		else if (ngayCong >= 22 && ngayCong < 25)
			return (int) (luongThang() * 0.10);
		return luongThang() * 0;
	}
	
	public int thuNhap() {
		return luongThang() + thuongNgayCong() + thuongPhuCap();
	}

	public String toString() {
		return "NV01 " + name + " " + luongThang() + " " + thuongNgayCong() + " " + thuongPhuCap() + " " +thuNhap(); 
	}
}

public class J04012 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String name = sc.nextLine();
		int luongCoBan = sc.nextInt();
		int ngayCong = sc.nextInt();
		String chucVu = sc.next();
		tinhCong tinhcong = new tinhCong(name,luongCoBan,ngayCong,chucVu);
		System.out.println(tinhcong);
	}
}
