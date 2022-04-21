package Bt5_Bai7;

import java.util.ArrayList;
import java.util.Scanner;


public class DemoNhanVien {
	ArrayList<NhanVien> listNv = new ArrayList<>();
	Scanner nhap = new Scanner(System.in);
	
	public int hienThiMenu() {
		System.out.println("........:Menu:........");
		System.out.println("1, Nhập danh sách nhân viên: ");
		System.out.println("2, Xuất danh sách nhân viên:");
		System.out.println("3, Tính tổng lương của nhân viên:");
		System.out.println("4: Thoát");
		System.out.println();
		return nhap.nextInt();
	}
	
	public void nhapTTNhanVien() {
		System.out.println("Nhập số nhân viên:");
		int soLuong = new Scanner(System.in).nextInt();
		for (int i = 0; i < soLuong; i++) {
			NhanVien tp = null;
			tp = new NhanVien();
			tp.nhapTT();
			listNv.add(tp);
		}
	}
	
	public void hienThiTTNhanVien() {
		for (NhanVien nv : listNv) {
			nv.hienThiTT();
		}
	}
	
	public static void main(String[] args) {
		DemoNhanVien demo = new DemoNhanVien();
		int luaChon = 0;
		do {
			luaChon = demo.hienThiMenu();
			switch (luaChon) {
			case 1:
				demo.nhapTTNhanVien();
				break;
			case 2:
				demo.hienThiTTNhanVien();
				break;
			default:
				break;
			}
		} while (luaChon > 0 && luaChon <4);
	}
	
	
	
	


}
