package Bt2_Bai5;

import java.util.ArrayList;
import java.util.Scanner;



public class TestNhanVien {
	ArrayList<Student> listSt = new ArrayList<>();
	public void nhapTTNhanVien() {
		System.out.println("Mời nhập số nhân viên cần thêm: ");
		int soLuong = new Scanner(System.in).nextInt();
		for (int i = 0; i < soLuong; i++) {
			Student nv = null;
			nv = new Student();
			listSt.add(nv);
			nv.nhapTT();
		}
	}
	
	public void hienThiTTNhanVien() {
		for (Student nv : listSt) {
			nv.hienThiTT();
			tinhTongLuong();
		}
	}
	
	public void tinhTongLuong() {
		float total = 0;
		for (Student student : listSt) {
			total += student.getTinhLuong();
		}
		System.out.println("Tổng số lương của nhân viên:" + total);
	}
	
	public static void main(String[] args) {
		TestNhanVien t = new TestNhanVien();
		t.nhapTTNhanVien();
		t.hienThiTTNhanVien();
	}
}
