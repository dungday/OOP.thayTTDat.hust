package Bt3_Bai2;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh vuông: ");
        int canhVuong = scanner.nextInt();
        canh n = new canh(canhVuong);
        n.draw();
	}
}
