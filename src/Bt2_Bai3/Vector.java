package Bt2_Bai3;

import java.util.Scanner;

public class Vector	 {
	private int x1, x2;
	private int y1, y2;
	private int z1, z2;
	private int HANG_SO;

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getZ1() {
		return z1;
	}

	public void setZ1(int z1) {
		this.z1 = z1;
	}

	public int getZ2() {
		return z2;
	}

	public void setZ2(int z2) {
		this.z2 = z2;
	}

	public int getHANG_SO() {
		return HANG_SO;
	}

	public void setHANG_SO(int hANG_SO) {
		HANG_SO = hANG_SO;
	}
	
	public String congVecto(int x, int y, int z) {
		x = x1 + x2;
		y = y1 + y2;
		z = z1 + z2;
		return "("+x+", "+y+" ,"+z+")";
	}
	
	public String truVecto(int x, int y, int z ) {
		x = x1 - x2;
		y = y1 - y2;
		z = z1 - z2;
		return "("+x+", "+y+", "+z+")";
	}
	
	public int nhanVoHuong() {
		return x1*x2 + y1*y2 + z1*z2;
	}
	
	public String nhanHangSo(int x, int y, int z) {
		x = x1 * HANG_SO;
		y = y1 * HANG_SO;
		z = z1 * HANG_SO;
		return "("+x+", "+y+", "+z+")";
	}
	
	
	public void nhapTt() {
		System.out.print("x1 = ");
		this.x1 = new Scanner(System.in).nextInt();
		System.out.print("x2 = ");
		this.x2 = new Scanner(System.in).nextInt();
		
		System.out.print("y1 = ");
		this.y1 = new Scanner(System.in).nextInt();
		System.out.print("y2 = ");
		this.y2 = new Scanner(System.in).nextInt();
		
		System.out.print("z1 = ");
		this.z1 = new Scanner(System.in).nextInt();
		System.out.print("z2 = ");
		this.z2 = new Scanner(System.in).nextInt();
		
		System.out.print("Hằng số = ");
		HANG_SO = new Scanner(System.in).nextInt();
		
	}
	
	
	public void hienTT() {
		System.out.println("Kết quả: ");
		System.out.println("Cộng vô hướng = " + congVecto(0, 0, 0));
		System.out.println("Trừ vô hướng = " + truVecto(0, 0, 0));
		System.out.println("Nhân vô hướng = " + nhanVoHuong());
		System.out.println("Nhân hằng số = " + nhanHangSo(0, 0, 0));
	}
	
	public static void main(String[] args) {
		Vector vt = new Vector();
		vt.nhapTt();
		vt.hienTT();
	}
}
