package Bt1_Bai3;

import java.util.Scanner;

public class HinhVuong {
	  int a;
	    int P,S;
	    public void nhap(){
	        Scanner add = new Scanner(System.in);
	        System.out.println("Nhập cạnh :");
	        a = add.nextInt();
	       
	    }
	    public void ChuViHv(){
	        System.out.println("Chu vi của hình vuông là: ");
	        P = a * 4;
	        System.out.println(P);
	    }
	    public void DienTichHv(){
	        System.out.println("Diện tích của hình vuông là: ");
	        S = a*a;
	        System.out.println(S);
	    }
}
