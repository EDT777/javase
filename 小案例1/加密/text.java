package 加密;
//罗马皇帝凯撒在打仗时用过这种加密
public class text {
public static void main(String[] args) {
	String before ="Ihaveasecret";
	char[] chars=before.toCharArray();
	int mima=9;
	for(int i=0;i<chars.length;i++) {
		char c=chars[i];
		if(c>='A'&&c<='Z') {
			c+=mima;
			if(c>'Z') {
				c-=26;
			}
		}else if(c>='a'&&c<='z') {
			
			c+=mima;
			if(c>'z') {
				c-=26;
			}
			
		}else {
			
		}
		chars[i]=c;
	}
	System.out.println("加密前的内容是:"+before+"\n加密后的密码为：");
	for(char c:chars) {
		System.out.print(c);
	}
	System.out.println();
	pojie(new String(chars),"have");
}

public static void pojie(String po,String guanjian) {
	for(int mima=0;mima<=26;mima++) {
		char[] chars=po.toCharArray();
		for(int i=0;i<chars.length;i++) {
			char c=chars[i];
			if(c>='A'&&c<='Z') {
				c-=mima;
				if(c<'A') {
					c+=26;
				}
			}else if(c>='a'&&c<='z') {
				
				c-=mima;
				if(c<'a') {
					c+=26;
				}
				
			}else {
				
			}
			chars[i]=c;
		}
		if(new String(chars).indexOf(guanjian)>-1) {
			System.out.println("密码为："+mima+"破解内容为："+new String(chars));
		}
	}
	
}
}
