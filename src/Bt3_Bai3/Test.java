package Bt3_Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	ArrayList<NhanVien> listNv = new ArrayList<>();
	public void nhapTTNhanVien() {
		System.out.println("Mời nhập số nhân viên cần thêm: ");
		int soLuong = new Scanner(System.in).nextInt();
		for (int i = 0; i < soLuong; i++) {
			NhanVien nv = null;
			nv = new NhanVien();
			listNv.add(nv);
			nv.nhapTT();
		}
	}
	
	public void hienThiTTNhanVien() {
		for (NhanVien nv : listNv) {
			nv.hienThiTT();
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.nhapTTNhanVien();
		t.hienThiTTNhanVien();
	}
}
