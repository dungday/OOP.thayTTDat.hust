package Bt6_Bai7;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {
	ArrayList<NhanVien> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public int Menu() {
		System.out.println("1 - Nhập thông tin");
		System.out.println("2 - In thông tin");
		return sc.nextInt();
	}
	
	public void nhapTTNhanVien() {
		System.out.println("Mời nhập số lượng nhân viên cần thêm: ");
		int soLuong = sc.nextInt();
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ": ");
			System.out.println("Loại nhân viên(1- Giám đốc,2- Cán bộ quản lí");
			System.out.println("Chọn 1 loại");
			int chon = sc.nextInt();
			sc.nextLine();
			NhanVien nv = new NhanVien();
			if(chon == 1) {
				nv = new GiamDoc();
			}else if(chon == 2) {
				nv = new CanBo_QuanLy();
			}
			nv.nhapTT();
			list.add(nv);
		}
	}
	
	public void xuatTTNhanVien() {
		for (NhanVien nhanVien : list) {
			nhanVien.inTT();
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		int luaChon = 0;
		do {
			luaChon = test.Menu();
			switch (luaChon) {
			case 1:
				test.nhapTTNhanVien();
				break;
			case 2:
				test.xuatTTNhanVien();
				break;
			default:
				break;	
			}
		} while (luaChon > 0 && luaChon < 9);
	}
}
