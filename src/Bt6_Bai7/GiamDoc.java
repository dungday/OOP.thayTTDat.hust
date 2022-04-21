package Bt6_Bai7;

import java.util.Scanner;

public class GiamDoc extends NhanVien implements QuanLy{
	
	private double phuCap;
	private double loiNhuanCongTy;
	private double tienHoaHong;
	private double tinhLuong;

	public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double lUONG_MAX, double tinhLuong,
			double phuCap, double loiNhuanCongTy, double tienHoaHong, double tinhLuong2) {
		super(tenNhanVien, luongCoBan, heSoLuong, lUONG_MAX, tinhLuong);
		this.phuCap = phuCap;
		this.loiNhuanCongTy = loiNhuanCongTy;
		this.tienHoaHong = tienHoaHong;
		tinhLuong = tinhLuong2;
	}
	
	public GiamDoc() {
		super();
	}
	

	public double getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}

	public double getLoiNhuanCongTy() {
		return loiNhuanCongTy;
	}

	public void setLoiNhuanCongTy(double loiNhuanCongTy) {
		this.loiNhuanCongTy = loiNhuanCongTy;
	}

	public double getTienHoaHong() {
		return tienHoaHong;
	}

	public void setTienHoaHong(double tienHoaHong) {
		this.tienHoaHong = tienHoaHong;
	}

	public double getTinhLuong() {
		return getLuongCoBan() * getHeSoLuong() + this.phuCap + getTienHoaHong(); // ???
	}

	public void setTinhLuong(double tinhLuong) {
		this.tinhLuong = tinhLuong;
	}

	@Override
	public void hoaHong() {
		setTienHoaHong(0.05 * this.loiNhuanCongTy);
	}
	
	@Override
	public void nhapTT() {
		super.nhapTT();
		System.out.println("Nhập phụ cấp: ");
		this.phuCap = new Scanner(System.in).nextDouble();
		System.out.println("Nhập lợi nhuận công ty: ");
		this.loiNhuanCongTy = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void inTT() {
		super.inTT();
		hoaHong();
		System.out.println("Phụ cấp:" + this.phuCap + 
				"\n" + "Lợi nhuận công ty:" + this.loiNhuanCongTy + 
				"\n" + "Hoa hồng giám đốc:" + getTienHoaHong() + 
				"\n" + "Lương giám đốc:" + getTinhLuong());
	}
}
