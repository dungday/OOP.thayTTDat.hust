package Bt2_Bai5;

import java.util.Scanner;

public class Student {
	private String tenNv;
	private double luongCoBan;
	private double heSoLuong;
	private double LUONG_MAX;
	private double tinhLuong;
	
	public Student(String tenNv, double luongCoBan, double heSoLuong, double lUONG_MAX, double tinhLuong) {
		this.tenNv = tenNv;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		LUONG_MAX = lUONG_MAX;
		this.tinhLuong = tinhLuong;
	}

	public Student() {
	}

	public String getTenNv() {
		return tenNv;
	}

	public void setTenNv(String tenNv) {
		this.tenNv = tenNv;
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
		return this.luongCoBan * this.heSoLuong;
	}

	public void setTinhLuong(double tinhLuong) {
		this.tinhLuong = tinhLuong;
	}

	@Override
	public String toString() {
		return "Tên nhân viên: " + this.tenNv +"\n" + "Lương cơ bản: " + this.luongCoBan + "\n" + "Hệ số lương: " + this.heSoLuong + "\n" +
				"Lương max: " + LUONG_MAX + "\n" + "Tính lương: " + getTinhLuong() + "\n" + "Cho phép tăng lương: " + tangLuong();
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
		this.tenNv = new Scanner(System.in).nextLine();
		System.out.println("Nhập lương cơ bản: ");
		this.luongCoBan = new Scanner(System.in).nextDouble();
		System.out.println("Nhập hệ số lương: ");
		this.heSoLuong = new Scanner(System.in).nextDouble();
		System.out.println("Nhập lương max: ");
		LUONG_MAX = new Scanner(System.in).nextDouble();
		
	}
	
	public void hienThiTT() {
		System.out.println(toString());
	}
}
