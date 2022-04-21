package Bt6_Bai7;

import java.util.Scanner;

public class NhanVien {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	private double LUONG_MAX;
	private double tinhLuong;
	
	public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double lUONG_MAX, double tinhLuong) {
		this.tenNhanVien = tenNhanVien;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		LUONG_MAX = lUONG_MAX;
		this.tinhLuong = tinhLuong;
	}

	public NhanVien() {
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getLUONG_MAX() {
		return LUONG_MAX;
	}

	public void setLUONG_MAX(double lUONG_MAX) {
		LUONG_MAX = lUONG_MAX;
	}

	public double getTinhLuong() {
		return tinhLuong;
	}

	public void setTinhLuong(double tinhLuong) {
		this.tinhLuong = tinhLuong;
	}
	
	public boolean tangLuong() {
		if(getTinhLuong() < LUONG_MAX) {
			System.out.println("Cho phép thay đổi");
			return true;
		}else if(getTinhLuong() > LUONG_MAX) {
			System.out.println("Không cho phép thay đổi");
		}
		return false;
		
	}
	
	public void nhapTT() {
		System.out.println("Nhập tên nhân viên: ");
		this.tenNhanVien = new Scanner(System.in).nextLine();
		System.out.println("Nhập lương cơ bản: ");
		this.luongCoBan = new Scanner(System.in).nextDouble();
		System.out.println("Nhập hệ số lương: ");
		this.heSoLuong = new Scanner(System.in).nextDouble();
		System.out.println("Nhập lương max: ");
		LUONG_MAX = new Scanner(System.in).nextDouble();
	}
	
	public void inTT() {
		System.out.println("Tên nhân viên: " + this.tenNhanVien);
		System.out.println("Lương cơ bản: " + this.luongCoBan);
		System.out.println("Hệ số lương: " + this.heSoLuong);
		System.out.println("Lương max: " + this.LUONG_MAX);
		System.out.println("Tăng lương: " + this.tangLuong());
	}
}
