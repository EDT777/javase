package 生成验证码;
//字符串由四个大写或者小写组成，每个字母都是随机产生
public class text {

	public static void main(String[] args) {
			for(int i=0;i<5;i++) {
				System.out.println("第"+(i+1)+"次产生的随机码"+genCode());
			}
	}
	//生成4位大小写字母组成的字符串
	public static String genCode() {
		StringBuffer code=new StringBuffer();
		int len=4;//要生产的长度
		for(int i=0;i<len;i++) {
			char random=(char)((Math.random()>0.5?'a':'A')+(int)(Math.random()*26));
			code.append(random);
		}
		return code.toString();
	}

}
