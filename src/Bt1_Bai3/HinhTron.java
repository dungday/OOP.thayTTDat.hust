package Bt1_Bai3;

import java.util.Scanner;

public class HinhTron {
	float PI = 3.14f;
    float r,cv,dt;
    
    public void nhap(){
        Scanner add = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        r = add.nextFloat();
    }
    public void ChuVi(){
        System.out.println("Chu vi của hình tròn là: ");
        cv =  2*r*PI;
        System.out.println(cv);
    }
    public void DienTich(){
        System.out.println("Diện tích của hình tròn là: ");
        dt = PI * r*r;
        System.out.println(dt);
    }
}
