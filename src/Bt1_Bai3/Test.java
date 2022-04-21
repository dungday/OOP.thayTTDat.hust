package Bt1_Bai3;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {

        
       Scanner input = new Scanner(System.in);
       HinhTron htron = new HinhTron();
       HinhVuong hv =new HinhVuong();
       
       int choose;
      do{
        show();
        choose = Integer.parseInt(input.nextLine());
          
         switch(choose){
            case 1:
                htron.nhap();
                break;
            case 2:
                htron.ChuVi();
                break;
            case 3:
                htron.DienTich();
                break;
            case 4:
                  hv.nhap();
                  break;
            case 5:
                hv.ChuViHv();
                break;
            case 6:
                hv.DienTichHv();
                break;
            case 7:
                System.out.println("Thoát");
                break;
                
                
          
      }
      }while(choose != 7);
       
    }
    public static void show(){
    	System.out.println("--------------Menu-------------");
		System.out.println("1. Nhập thông tin hình tròn.");
		System.out.println("2. Tính chu vi hình tròn.");
		System.out.println("3. Tính diện tích hình tròn.");
        System.out.println("4. Nhập thông tin hình vuông.");
		System.out.println("5. Tính chu vi hình vuông.");
		System.out.println("6. Tính diện tích hình vuông.");
        System.out.println("7. Thoát.");
        System.out.println("-------------------------------");
    }
}
