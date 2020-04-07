package 集合生成不重复1000000个随机数;

import java.util.HashSet;
import java.util.*;

public class text1 {

	public static void main(String[] args) {
			int len=100000;
			long time1=System.currentTimeMillis();
			genRandomBySet(len);
			long time2=System.currentTimeMillis();
			System.out.println("使用Set排除重复的时间为："+(time2-time1));
			time1=System.currentTimeMillis();
			genRandomByList(len);
			time2=System.currentTimeMillis();
			System.out.println("直接算法排除重复的时间为:"+(time2-time1));
			
	}
	//使用set集合实现元素不重复
	public static Set genRandomBySet(int len) {
		HashSet set = new HashSet<>();
		int num=0;
		while(num<len) {
			String randomString =String.valueOf(Math.random());
			boolean result =set.add(randomString);//是否添加成功
			num+=(result==true?1:0);
		}
		return set;
	}
	public static List genRandomByList(int len) {
		int init=10;
		List list=new ArrayList<>();
		for(int i=0;i<len;i++) {
			init++;
			init+=Math.random()*len*2;
			list.add(String.valueOf(init));
		}
		//打乱保证和set的最终效果差不多
		Collections.shuffle(list);
		return list;
		
	}
	}


