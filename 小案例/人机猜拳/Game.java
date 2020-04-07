package 人机猜拳;


import java.util.Scanner;

/**
 * 代表主持游戏的裁判
 * 
 * @author Administrator
 * 
 */
public class Game {
	Scanner input = new Scanner(System.in);
	/**
	 * 当前对战次数
	 */
	public int count;

	/**
	 * 参与游戏的人玩家
	 */
	public Person person;

	/**
	 * 参与游戏的计算机玩家
	 */
	public Computer computer;

	/**
	 * 实现游戏的初始化
	 */
	public void initial() {
		// 玩家激活
		this.person = new Person();
		this.computer = new Computer();
		// 分数归零
		this.count = 0;
		// 玩家分数归零，其实可以不写，因为new的时候这些属性都变成默认值0了
		this.person.score = 0;
		this.computer.score = 0;
	}
	
	

	/**
	 * 裁判选择角色的功能
	 */
	public void chooseCharacter() {
		//电脑的角色选择
		String[] names = { "曹操", "刘备", "潘金莲" };
		System.out.println("猜拳开始，( 1、曹操 2、刘备 3、潘金莲)请选择电脑角色:");
		int num = input.nextInt();
		if (num >= 1 && num <= names.length) {
			this.computer.name = names[num - 1];
		}else{
			System.out.println("您的输入不正确");
		}
		//人的角色选择
		System.out.print("请输入您的大名:");
		this.person.name = input.next();
		
		

	}

	/**
	 * 猜拳
	 */
	public void game() {
		
		System.out.print("现在开始吗?(y/n)");
		String ans =input.next();
		while(ans.equals("y")){
			//人出拳
			int num0 = this.person.showFist();
			//电脑出拳
			int num1 = this.computer.showFist();
			//比较输赢
			if(num0==1 && num1==2 || num0==2 && num1==3 || num0==3 && num1==1){//人赢了的条件
				this.person.score++;
				System.out.println(this.person.name+"赢了");
			}else if(num0==num1){
				System.out.println("和局");
			}else{
				this.computer.score++;
				System.out.println(this.computer.name+"赢了");
			}
			//计分
			
			//总局数+1
			this.count++;
			
			System.out.print("继续猜拳吗?(y/n)");
			ans =input.next();
		}
		//游戏结束，判断结果
		result();
		
		
	}

	/**
	 * 结果处理
	 */
	public void result() {
		if(this.computer.score<this.person.score){
			System.out.println("电脑说：别嘚瑟，下次我一定赢回你");
		}else if(this.computer.score>this.person.score){
			System.out.println("电脑说：哈哈，你是打不过我的，手下败将");
		}else{
			System.out.println("电脑说：打平了！今天只是有点小失足，下次一定打败你");
		}
	}
}

