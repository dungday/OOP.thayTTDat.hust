package Bt6_Bai7;

import java.util.Scanner;

public class CanBo_QuanLy extends NhanVien implements QuanLy{
	
	private double loiNhuanCongTy;
	private double tienHoaHong_canBo;
	private double tinhLuong_canBo;
	
	public CanBo_QuanLy(String tenNhanVien, double luongCoBan, double heSoLuong, double lUONG_MAX, double tinhLuong,
			double loiNhuanCongTy, double tienHoaHong_canBo, double tinhLuong_canBo) {
		super(tenNhanVien, luongCoBan, heSoLuong, lUONG_MAX, tinhLuong);
		this.loiNhuanCongTy = loiNhuanCongTy;
		this.tienHoaHong_canBo = tienHoaHong_canBo;
		this.tinhLuong_canBo = tinhLuong_canBo;
	}

	public CanBo_QuanLy() {
		super();
	}
	
	public double getLoiNhuanCongTy() {
		return loiNhuanCongTy;
	}

	public void setLoiNhuanCongTy(double loiNhuanCongTy) {
		this.loiNhuanCongTy = loiNhuanCongTy;
	}

	public double getTienHoaHong_canBo() {
		return tienHoaHong_canBo;
	}

	public void setTienHoaHong_canBo(double tienHoaHong_canBo) {
		this.tienHoaHong_canBo = tienHoaHong_canBo;
	}

	public double getTinhLuong_canBo() {
		return getLuongCoBan() * getHeSoLuong() + getTienHoaHong_canBo();
	}

	public void setTinhLuong_canBo(double tinhLuong_canBo) {
		this.tinhLuong_canBo = tinhLuong_canBo;
	}

	@Override
	public void hoaHong() {
		setTienHoaHong_canBo(0.002 * this.loiNhuanCongTy);
	}
	
	@Override
	public void nhapTT() {
		super.nhapTT();
		System.out.println("Nhập lợi nhuận công ty:");
		this.loiNhuanCongTy = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void inTT() {
		super.inTT();
		hoaHong();
		System.out.println("Lợi nhuận công ty:" + this.loiNhuanCongTy + 
				"\n" +"Hoa hồng cán bộ quản lí:" + getTienHoaHong_canBo() + 
				"\n" + "Lương cán bộ quản lí:" + getTinhLuong_canBo());
	}
}
