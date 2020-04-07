package 改造菱形;

import java.util.Scanner;

//使用面向对象思想改造菱形的打印，考虑属性和方法的定义
//要求使用有参构造函数
//同时编写代码在main方法中实现对象的创建和调用
public class text {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("请输入菱形大小:");
			int size=s.nextInt();
			System.out.print("请输入每行菱形数:");
			int column =s.nextInt();
			System.out.print("请输入总行数:");
			int row=s.nextInt();
			
			text t = new text(size,column,row);//实例化对象
			t.printShape();//打印
			s.close();
		}
		
		public int size;
		public int column;
		public int row;
		
		public text(int size,int column,int row) {
			this.size=size;
			this.column=column;
			this.row=row;
		}
		
		//打印形状
		public void printShape() {
			for(int row1=0;row1<row;row1++) {
				//打印一个菱形上三角
				printUpTriangle();
				//打印一个菱形下三角
				printDonwTriangle();
			}
			
		}
		public void printDonwTriangle() {
			for(int i=size-2;i>=0;i--) {
				for(int k=0;k<column;k++) {
					//先输出空格
					if(k==0) {
					for(int j=size-i-1;j>0;j--) {
						System.out.print(" ");
					}
					}else {
						for(int j=size-i-1;j>0;j--) {
							System.out.print("  ");
						}
					}
					//再输出星号
					for(int j=0;j<=i*2;j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
		//打印上三角
		public void printUpTriangle() {
			for(int i=0;i<size;i++) {
				for(int k=0;k<column;k++) {
					//先输出空格
					if(k==0) {
					for(int j=size-i-1;j>0;j--) {
						System.out.print(" ");
					}
					}else {
						for(int j=size-i-1;j>0;j--) {
							System.out.print("  ");
						}
					}
					//再输出星号
					for(int j=0;j<=i*2;j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
		
}
