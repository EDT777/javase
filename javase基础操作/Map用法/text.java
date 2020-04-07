package Map用法;
import java.util.*;
import java.io.*;
import java.util.Map;
//使用Map实现单词统计功能，统计的字符串为：
//String content = "The String class is immutable, so that once it is created a String object cannot be changed. The String class has a number of methods, some of which will be discussed below, that appear to modify strings. Since strings are immutable, what these methods really do is create and return a new string that contains the result of the operation. ";

public class text {

	public static void main(String[] args) {
		
		String content = "The String class is immutable, so that once it is created a String object cannot be changed. The String class has a number of methods, some of which will be discussed below, that appear to modify strings. Since strings are immutable, what these methods really do is create and return a new string that contains the result of the operation. ";
		String[] words =content.split("[\\|,.]+");//所有分隔符都要考虑
		//创建集合，key为单词，value为单词的个数
		Map map = new LinkedHashMap<>();
		for (int i =0;i<words.length;i++) {
			String w = words[i];
			Integer count = (Integer) map.get(w);
			if(count==0) {
				//没有，添加当前单词的计数
				count =Integer.valueOf(1);//尽量利用缓冲
				//放入集合
				map.put(w,count);
			}else {
				count++;
				map.put(w,count);
			}
			}
		
		//输出
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		}
	}
	
	


