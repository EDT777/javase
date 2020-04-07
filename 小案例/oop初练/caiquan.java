package oop初练;

import java.util.Scanner;

public class caiquan {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean b;
		int juese;//人物角色標號
		String juesee;// 角色人物
		String duishouu = null ;// 电脑人物角色
		int huiji;// 电脑出拳标号
		String huijiji;// 电脑所出的拳
		int duishou;// 电脑角色人物標號
		int quan;// 玩家出拳标号
		String s=" ";// 是否开始游戏
		String name=" ";// 玩家游戏名称
		do {
			System.out.println("(人机猜拳开始，请选择你的角色): 1.曹操,2.刘备,3.潘金莲");
			juese = scn.nextInt();
			b = false;

			if (juese == 1) {
				juesee = "曹操";
				break;
			} else if (juese == 2) {
				juesee = "刘备";
				break;
			} else if (juese == 3) {
				juesee = "潘金莲";
				break;
			} else {
				b = true;
			}
		} while (b);

		System.out.println("请输入你的大名：");
		name = scn.next();
		do {
		System.out.println("你要开始猜拳吗？(y/n):");
		s = scn.next();
		
		if (s.equals("y")) {
			do {
				System.out.println("请输入您猜拳的数字(1.石头 2.剪刀 3.布):");
				quan = scn.nextInt();
				b = false;
				if (quan == 1) {
					System.out.println(name + "出的是石头");
					break;
				} else if (quan == 2) {
					System.out.println(name + "出的是剪刀");
					break;
				} else if (quan == 3) {
					System.out.println(name + "出的是布");
					break;
				} else {
					b = true;
				}
			} while (b);

			duishou = (juese == 1 ? 2 : 1);
			if (duishou == 1) {
				duishouu = "曹操";
			} else if (duishou == 2) {
				duishouu = "刘备";
			}
			do {
				huiji = (int) (Math.random() * 4);
				b =true;
				if (huiji != 0) {
					break;
				}
			} while (b);
			if (huiji == 1) {
				huijiji = "石头";

			} else if (huiji == 2) {
				huijiji = "剪刀";
			} else {
				huijiji = "布";
			}
			System.out.println(duishouu + "出的是" + huijiji);

			if (quan == 1 && huiji == 2) {
				System.out.println(name + "赢了");
			} else if (quan == 2 && huiji == 1) {
				System.out.println(duishouu + "赢了");
			} else if (quan == 3 && huiji == 1) {
				System.out.println(name + "赢了");
			} else if (quan == 1 && huiji == 3) {
				System.out.println(duishouu + "赢了");
			} else if (quan == 2 && huiji == 3) {
				System.out.println(quan + "赢了");
			} else if (quan == 3 && huiji == 2) {
				System.out.println(duishouu + "赢了");
			} else if (quan == huiji) {
				System.out.println("这场平局");
			}
			b=true;
		} else if (s.equals("n")) {
			System.out.println("你还是太嫩了");
			break;
		} else {
			b=true;
		}
		}while(b);

	}

}
