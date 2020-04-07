package 单词规则;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class text {

	public static void main(String[] args) {
				Scanner scn = new Scanner(System.in);
				System.out.print("请输入一个英语句子：");
				String content =scn.nextLine();//完整的句子
				System.out.println(content);
				//拆分成单词
				String[]words =content.split(" ");
				//转小骆驼：第一个单词首字母小写，其他单词首字母大写
				StringBuffer camelName=new StringBuffer();
				for(int i=0;i<words.length;i++) {
					if(i==0) {
						camelName.append(converWord(words[i],false));
					}else {
						camelName.append(converWord(words[i],true));
					}
				}
				System.out.println("驼峰命名法的名称为："+camelName.toString());
				camelName.setLength(0);//清除
				for(int i=0;i<words.length;i++) {
					camelName.append(converWord(words[i],true));
				}
				System.out.println("Pascal名法的名称为："+camelName.toString());
				camelName.setLength(0);//清空数据
				for(int i=0;i<words.length-1;i++) {
					camelName.append(words[i].toUpperCase()+"_");//直接转大写
				}
				//最后一个单词是没有的
				camelName.append(words[words.length-1].toUpperCase());
				System.out.println("常量命名法的名称为："+camelName.toString());
				
				scn.close();
				

}

	private static Object converWord(String word, boolean firstLetterUpperCase) {
		
		char[] chars=word.toCharArray();
		if(firstLetterUpperCase&& chars[0]>='a'&&chars[0]<='z') {
			chars[0]-=32;
		}
		if(!firstLetterUpperCase&&chars[0]>='A'&&chars[0]<='Z') {
			chars[0]+=32;
		}
		return new String(chars);
	}
	}
