package 菱形;
import java.util.*;
public class text {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("请输入菱形大小");
			int size =s.nextInt();
			System.out.print("请输入每行菱形数");
			int column=s.nextInt();
			System.out.print("请输入总行数");
			int row =s.nextInt();
			
			textt t = new textt(size,column,row);
			t.printShape();//打印
			
			
	}
	public int size;
	public int column;
	public int row;
		public text(int size,int column,int row) {
			this.size=size;
			this.column=column;
			this.row=row;
		}
		public void printShape(){
			for(int row1=0;row1<row;row1++) {
				//打印一个菱形上三角
				printUpTriangle();
				//打印一个菱形下三角
				printDonwTriangle();
			}
		}
		//打印菱形下三角
		private void printDonwTriangle() {
			for(int i=size-2;i>=0;i--) {
				for(int k=0;k<column;k++) {
					//先输出空格
					if(k==0) {
						//先输出空格
						for(int j=size-1-i;j>0;j--) {
							System.out.print(" ");
						}
					}
					else {
						for(int j =size-i-1;j>0;j--) {
							System.out.print(" ");
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
		public void printUpTriangle() {
			for(int i=0;i<size;i++) {
				for(int k=0;k<column;k++) {
					if(k==0) {
						//先输出空格
						for(int j=size-i-1;j>0;j--) {
							System.out.print(" ");
						}
					}
					else {
						for(int j=size-i-1;j>0;j--) {
							System.out.print(" ");
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
