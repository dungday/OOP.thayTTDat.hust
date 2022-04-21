package Bt5_Bai7;

import java.util.Scanner;

public class TruongPhong {
	private double phuCap;
	private double soNamDuongChuc;
	private double tinhLuongTruongPhong;
	
	
	public TruongPhong(double phuCap, double soNamDuongChuc, double tinhLuongTruongPhong) {
		this.phuCap = phuCap;
		this.soNamDuongChuc = soNamDuongChuc;
		this.tinhLuongTruongPhong = tinhLuongTruongPhong;
	}

	public TruongPhong() {
	}
	
	public double getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}

	public double getSoNamDuongChuc() {
		return soNamDuongChuc;
	}

	public void setSoNamDuongChuc(double soNamDuongChuc) {
		this.soNamDuongChuc = soNamDuongChuc;
	}

	public double getTinhLuongTruongPhong() {
		return tinhLuongTruongPhong;
	}

	public void setTinhLuongTruongPhong(double tinhLuongTruongPhong) {
		this.tinhLuongTruongPhong = tinhLuongTruongPhong;
	}

	
	public void nhapTT() {
		System.out.println("Nhập phụ cấp:");
		this.phuCap = new Scanner(System.in).nextDouble();
		System.out.println("Nhập số năm:");
		this.soNamDuongChuc = new Scanner(System.in).nextDouble();
	}
	
	public void hienThiTT() {
		System.out.println("Phụ cấp:" + this.phuCap);
		System.out.println("Năm: " + this.soNamDuongChuc);
	}
	
	
}
