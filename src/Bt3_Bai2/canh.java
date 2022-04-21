package Bt3_Bai2;

public class canh extends tamgiac {
	private int canhVuong, n;

	public canh(int canhVuong) {
		super();
		if ((canhVuong < 2) || (canhVuong > 10)) {
			System.out.println("Giá trị của cạnh phải nằm trong khoảng [2->10]");
			return;
		}
		this.canhVuong = canhVuong;
	}

	public int getCanhVuong() {
		return canhVuong;
	}

	public void setCanhVuong(int canhVuong) {
		this.canhVuong = canhVuong;
	}

	public void draw() {
		n = canhVuong;
		for (int i = 1; i <= canhVuong; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
