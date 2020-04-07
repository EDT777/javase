package oop初练;

import java.util.Scanner;

public class OOPPrintShape {
	
	//打印上半部分菱形
	public void shang(int size,int column) {
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < column; k++) {
				if (k == 0) {
					// 先输出空格
					for (int j = size - i - 1; j > 0; j--) {
						System.out.print(" ");
					}
				} else {
					for (int j = size - i - 1; j > 0; j--) {
						System.out.print("  ");
					}
				}
				// 再输出星号
				for (int j = 0; j <= i * 2; j++) {
					System.out.print("*");
				}

			}
			System.out.println();

		}
	}
	//打印下半部分菱形
	public void xia(int size,int column) {
		for (int i = size - 2; i >= 0; i--) {
			for (int k = 0; k < column; k++) {
				// 先输出空格
				if (k == 0) {
					// 先输出空格
					for (int j = size - i - 1; j > 0; j--) {
						System.out.print(" ");
					}
				} else {
					for (int j = size - i - 1; j > 0; j--) {
						System.out.print("  ");
					}
				}
				// 再输出星号
				for (int j = 0; j <= i * 2; j++) {
					System.out.print("*");
				}
			}
				System.out.println();
	
		}
	}
	//打印几行的菱形
	public void print(int size,int column,int row) {
		for (int row1 = 0; row1 < row; row1++) {
			shang(size, column) ;
			xia(size, column);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入棱形大小:");
		int size = input.nextInt();
		System.out.print("请输入每行棱形数:");
		int column = input.nextInt();
		System.out.print("请输入总行数:");
		int row = input.nextInt();
		OOPPrintShape t = new OOPPrintShape();
		t.print(size, column, row);
	}

}
