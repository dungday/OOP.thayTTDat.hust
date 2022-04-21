package Bt1_Bai4;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	ArrayList<Student> list =  new ArrayList<>();
	public void nhapTTSinhVien() {
		System.out.println("Mời nhập số nhân viên cần thêm: ");
		int n = new Scanner(System.in).nextInt();
		for (int i = 0; i < n; i++) {
			Student st = null;
			st = new Student();
			list.add(st);
			st.nhapTT();
		}
	}
	
	public void hienThiTTSinhVien() {
		int total = 0;
		for (Student st : list) {
			total += 2020 - st.getYear();
			st.inTT();
		}
		System.out.println("Tổng số tuổi: " + total);
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		t.nhapTTSinhVien();
		t.hienThiTTSinhVien();
		
	}

}	
