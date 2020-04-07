package 代理;

import java.util.Scanner;

public class RuHuaProxy implements RuHua {
	
	private RuHua target;
	public  void canYuxiangQin() {
		Scanner scn = new Scanner(System.in);
			System.out.println("帅哥你月薪多少？");
			scn.close();
			int salary = scn.nextInt();
			if(salary<10000) {
				System.out.println("不好意思，我妈找我有事");
			}else {
				//老妈会让真正的如花出来参与相亲
				target.canYuxiangQin();
			}
		
	}
	
	public void setTarget(RuHua target) {
		this.target=target;
	}

	public RuHua getTarget() {
		return target;
	}

	@Override
	public void showInfo() {
		this.target.showInfo();
	}
	
}
