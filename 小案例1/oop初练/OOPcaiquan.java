package oop初练;

import java.util.Scanner;
		
public class OOPcaiquan {
	public String getname(int name) {
			
			if(name==1) {
				return "曹操";
			}else if(name==2){
				return "刘备";
			}else if(name==3) {
				return"潘金莲";
			}else {
				return"-1";
			}
			
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("猜拳开始，(1.曹操 2.刘备 3.潘金莲)请选择电脑角色:");
		int juese =scn.nextInt();//人物标号
		OOPcaiquan o = new OOPcaiquan();
		String name1=o.getname(juese);//获取电脑角色名称
		System.out.println("请输入你的大名");
		String name2=scn.next();//输入你的游戏名称
		
		
		
	}
}
