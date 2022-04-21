package Bt5_Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien extends TruongPhong{
	private String tenNv;
	private double luongCoBan;
	private double heSoLuong;
	private double LUONG_MAX;
	private double tinhLuong;
	
	public NhanVien(double phuCap, double soNamDuongChuc, double tinhLuongTruongPhong, String tenNv, double luongCoBan,
			double heSoLuong, double lUONG_MAX, double tinhLuong) {
		super(phuCap, soNamDuongChuc, tinhLuongTruongPhong);
		this.tenNv = tenNv;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		LUONG_MAX = lUONG_MAX;
		this.tinhLuong = tinhLuong;
	}

	public NhanVien() {
		super();
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
		return this.heSoLuong * this.luongCoBan ;
	}

	public void setTinhLuong(double tinhLuong) {
		this.tinhLuong = tinhLuong;
	}
	
	@Override
	public double getTinhLuongTruongPhong() {
		return getLuongCoBan() * getHeSoLuong() + getPhuCap();
	}

	
	@Override
	public void nhapTT() {
		super.nhapTT();
		System.out.println("Nhập tên nhân viên:");
		this.tenNv = new Scanner(System.in).nextLine();
		System.out.println("Nhập lương cơ bản:");
		this.luongCoBan = new Scanner(System.in).nextDouble();
		System.out.println("Nhập hệ số lương:");
		this.heSoLuong = new Scanner(System.in).nextDouble();
		System.out.println("Nhập lương max:");
		LUONG_MAX = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("Tên nhân viên:" + this.tenNv);
		System.out.println("Lương cơ bản:" + this.luongCoBan);
		System.out.println("Hệ số lương:" + this.heSoLuong);
		System.out.println("Lương max:" + this.LUONG_MAX);
		System.out.println("Tổng lương: " + getTinhLuong());
		System.out.println("Lương trưởng phòng:" + getTinhLuongTruongPhong());
	}
	
	
	

}
