package Bt1_Bai4;

import java.util.Scanner;

public class Student {
	private int year;
	private String name;
	
	public Student(int year, String name) {
		this.year = year;
		this.name = name;
	}
	
	
	public Student() {
	}

	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void nhapTT() {
		System.out.println("Nhập tên: ");
		this.name = new Scanner(System.in).nextLine();
		System.out.println("Nhập năm sinh: ");
		this.year = new Scanner(System.in).nextInt();
	}
	
	public void inTT() {
		System.out.println("Tên: " + this.name);
		System.out.println("Năm sinh: " + this.year);
	}
	

}
	