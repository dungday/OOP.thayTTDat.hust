package BT_Bai6;

import java.util.Scanner;

public class NhanVien extends PhongBan{
	private String tenNhanVien;
	private double heSoLuong;
	private double LUONG_CO_BAN = 750000;
	private double LUONG_MAX = (long)20000000;
	public double tinhLuong;
	
	public NhanVien(String tenPB, String tenNhanVien, double heSoLuong, double lUONG_CO_BAN, double lUONG_MAX,
			double tinhLuong) {
		super(tenPB);
		this.tenNhanVien = tenNhanVien;
		this.heSoLuong = heSoLuong;
		LUONG_CO_BAN = lUONG_CO_BAN;
		LUONG_MAX = lUONG_MAX;
		this.tinhLuong = tinhLuong;
	}

	public NhanVien(String tenPB) {
		super(tenPB);
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

	public double getTinhLuong() {
		return heSoLuong * LUONG_CO_BAN;
	}

	public void setTinhLuong(double tinhLuong) {
		this.tinhLuong = tinhLuong;
	}
	
	public void nhapTT() {
		System.out.println("Nhập tên nhân viên:");
		this.tenNhanVien = new Scanner(System.in).nextLine();
		System.out.println("Nhập hệ số lương: ");
		this.heSoLuong = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("Tên nhân viên: " + this.tenNhanVien);
		System.out.println("Hệ số lương: " + this.heSoLuong);
		System.out.println("Lương: " + getTinhLuong());
	}
	
	
	public static void main(String[] args) {
		NhanVien nv = new NhanVien("1");
		nv.nhapTT();
		nv.inTT();
	
	}

}
