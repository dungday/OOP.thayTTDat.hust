package Bt7_Bai5;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
	private double phuCap;
	private double soNamDuongChuc;
	private double tinhLuongTruongPhong;
	
	public TruongPhong(String tenNhanVien, double heSoLuong, long lUONG_CO_BAN, long lUONG_MAX,
			double tinhLuongNhanVien, double phuCap, double soNamDuongChuc, double tinhLuongTruongPhong) {
		super(tenNhanVien, heSoLuong, lUONG_CO_BAN, lUONG_MAX, tinhLuongNhanVien);
		this.phuCap = phuCap;
		this.soNamDuongChuc = soNamDuongChuc;
		this.tinhLuongTruongPhong = tinhLuongTruongPhong;
	}
	
	public TruongPhong() {		
		super();
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
		return getLUONG_CO_BAN() * getHeSoLuong() + getPhuCap();
	}
	
	public void setTinhLuongTruongPhong() {
		this.tinhLuongTruongPhong = tinhLuongTruongPhong;
	}
	
	@Override
	public void nhapTT() {
		super.nhapTT();
		System.out.println("Nhập phụ cấp: ");
		this.phuCap = new Scanner(System.in).nextDouble();
		System.out.println("Nhập số năm đương chức: ");
		this.soNamDuongChuc = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void xuatTT() {
		super.xuatTT();
		System.out.println("Phụ cấp: " + this.phuCap);
		System.out.println("Số năm đương chức: " + this.soNamDuongChuc);
		System.out.println("Lương trưởng phòng:" + getTinhLuongTruongPhong());
	}
	
	public static void main(String[] args) {
		TruongPhong tp = new TruongPhong();
		tp.nhapTT();
		tp.xuatTT();
	}

}
