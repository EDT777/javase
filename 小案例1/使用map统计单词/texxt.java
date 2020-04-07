package 使用map统计单词;
import java.util.*;
public class texxt {
			public static void main(String[] args) {
				String content="This String class is immutable, so that once it is created a String object cannot be changed. The String class has a number of methods,some of which will be discussed below,that appear to modify strings. Since strings are immutable,what these methods really do is create and return a new string that contains the result of the operation.";
				String[] words =content.split("\\|,.]+");//所以分隔符都要考虑到
				//创建集合
				Map<String,Integer> map =new LinkedHashMap<>();
				for(int i=0;i<words.length;i++) {
					String w=words[i];
					Integer count =map.get(w);
					if(count==null) {
						//没有，添加当前单词的计较
						count = Integer.valueOf(1);//尽量利用缓存
						//放入集合
						map.put(w, count);
						
						
					}else {
						count++;
						map.put(w, count);
					}
				}
				//输出
				for(String key:map.keySet()) {
					System.out.println(key+":"+map.get(key));
				}
				
				
			}
}
