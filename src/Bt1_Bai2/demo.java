package Bt1_Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();		
		System.out.println("Nhập vào số phần tử: ");
		int n = new Scanner(System.in).nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào các số: ");
			int so = new Scanner(System.in).nextInt();
			list.add(so);
		}
		
		System.out.println("Mảng sau khi nhập là: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Mảng sau khi random là: ");
		Collections.shuffle(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}
}
