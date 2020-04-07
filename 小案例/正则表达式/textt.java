package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class textt {

	public static void main(String[] args) {
		
			String email ="1445417290@qq.com";
			String pattern ="\\w+@\\w+(\\.\\w+){1,2}";
			if(Pattern.matches(pattern, email)) {//判断返回boolean类型
				System.out.println("这是一个合格的邮箱");
			}else {
				System.out.println("这是一个不合格的邮箱");
			}
			
			System.out.println("-----------------------");
			String s ="1啊2b3c4dt";
			Pattern p =Pattern.compile("\\d+");
			Matcher matcher = p.matcher(s);//匹配
			while(matcher.find()) {//一个个找
				System.out.println(matcher.group());
			}
	}

}
