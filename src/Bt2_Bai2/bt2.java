package Bt2_Bai2;

import java.util.Scanner;

public class bt2 {
	
	public static void main(String[] args) {
		System.out.println("Nhập số phần tử của mảng: ");
		int n = new Scanner(System.in).nextInt();
		
		int[] arr = new int[n];
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhập phần tử thứ " + i + ": ");
			arr[i] = new Scanner(System.in).nextInt();
		}
		
		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i < n - 1; i++) {	
			for (int j = i + 1; j < n - 1 ; j++) {
				if(arr[i] > arr[j]) {
					int tam = arr[i];
					arr[i] = arr[j];
					arr[j] = tam;
				}
			}
		}
		
		System.out.println("Mảng sau khi sắp xếp là: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}
}	
