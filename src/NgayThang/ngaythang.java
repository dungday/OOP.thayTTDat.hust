package NgayThang;

import java.util.Scanner;

public class ngaythang {
	public static void main(String[] args) {
		int thang;
		int nam;
		System.out.print("Nhập tháng: ");
		thang = new Scanner(System.in).nextInt();
		switch (thang) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("Tháng có 31 ngày");
			break;
		case 2:
			System.out.print("Nhập năm: ");
			nam = new Scanner(System.in).nextInt();
			if((nam % 4 == 0 )){
				System.out.println("Tháng có 29 ngày");
			}else {
				System.out.println("Tháng có 28 ngày");
			}
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("Tháng có 30 ngày");
			break;
		default:
			System.out.println("Không có tháng này");
			break;
		}
		
	}
}
