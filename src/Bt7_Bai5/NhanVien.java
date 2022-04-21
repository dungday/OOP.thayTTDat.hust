package Bt7_Bai5;

import java.util.Scanner;

public class NhanVien {
	private String tenNhanVien;
	private double heSoLuong;
	private double LUONG_CO_BAN =(long) 750000;
	private double LUONG_MAX =(long) 20000000;
	private double tinhLuongNhanVien;
	
	public NhanVien() {
	}

	public NhanVien(String tenNhanVien, double heSoLuong, double lUONG_CO_BAN, double lUONG_MAX,
			double tinhLuongNhanVien) {
		this.tenNhanVien = tenNhanVien;
		this.heSoLuong = heSoLuong;
		LUONG_CO_BAN = lUONG_CO_BAN;
		LUONG_MAX = lUONG_MAX;
		this.tinhLuongNhanVien = tinhLuongNhanVien;
	}
	
	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getLUONG_CO_BAN() {
		return LUONG_CO_BAN;
	}

	public void setLUONG_CO_BAN(double lUONG_CO_BAN) {
		LUONG_CO_BAN = lUONG_CO_BAN;
	}

	public double getLUONG_MAX() {
		return LUONG_MAX;
	}

	public void setLUONG_MAX(double lUONG_MAX) {
		LUONG_MAX = lUONG_MAX;
	}

	public double getTinhLuongNhanVien() {
		return getLUONG_CO_BAN() * getHeSoLuong();
	}

	public void setTinhLuongNhanVien(double tinhLuongNhanVien) {
		this.tinhLuongNhanVien = tinhLuongNhanVien;
	}

	public boolean tangLuong() {
		if(getTinhLuongNhanVien() < LUONG_MAX) {
			System.out.println("Cho phép thay đổi");
			return true;
		}else if(getTinhLuongNhanVien() > LUONG_MAX) {
			System.out.println("Không cho phép thay đổi");
		}
		return false;
	}
	
	public void nhapTT() {
		System.out.println("Nhập tên nhân viên: ");
		this.tenNhanVien = new Scanner(System.in).nextLine();
		System.out.println("Nhập hệ số lương: ");
		this.heSoLuong = new Scanner(System.in).nextDouble();	
	}
	
	public void xuatTT() {
		System.out.println("Tên nhân viên: " + this.tenNhanVien);
		System.out.println("Hệ số lương: " + this.heSoLuong);
		System.out.println("Lương: " +  getTinhLuongNhanVien());
		System.out.println("Tăng lương: " + this.tangLuong());
	}	
	
}
