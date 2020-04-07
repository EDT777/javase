package 菱形;

import java.util.Scanner;

/**
 * 可定制的棱形输出 <br/>
 * 需要资料欢迎大家加<b>班主任Amy老师QQ：2454227267 </b> <br/>
 * 交流技术欢迎大家加<b>Jason老师QQ：1626883728</b>
 * 
 * @author Jason @章鱼教育 www.zyejy.com
 * @date 2019-04-12
 *
 */
public class textt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入棱形大小:");
		int size = input.nextInt();
		System.out.print("请输入每行棱形数:");
		int column = input.nextInt();
		System.out.print("请输入总行数:");
		int row = input.nextInt();

		for (int row1 = 0; row1 < row; row1++) {
			// 打印一个棱形
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
		input.close();
	}
}

