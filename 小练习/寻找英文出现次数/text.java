package 寻找英文出现次数;
import java.util.*;
public class text {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("请输入一段英文");
			String content =s.nextLine();
			//计数变量
			int count=0;
			//查找的变量
			int index = -1;
			do {
				//这里的'a'也可以修改为任意一个单词
				index = content.indexOf('a',index+1);
				if(index!=-1) {
					count++;
				}
			}while(index!=-1);
			System.out.println("a的出现次数为："+count);
			//如果确定查找对象是字母,则可以使用下面的方法
			count = 0;//重新开始计数
			char[] letters = content.toCharArray();
			for(char c:letters) {
				if(c=='a') {
					count++;
				}
			}
			System.out.println("a的出现次数为:"+count);
			s.close();
				
			}
	}


