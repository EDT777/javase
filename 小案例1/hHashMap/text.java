package hHashMap;

import java.util.HashMap;
import java.util.StringTokenizer;

public class text {
	public static void main(String args[])
    {		//放入字符串
			String str = "Java is a powerful programming languange,it's simple,fast,robust!||Most of all,it's widely used by the programers all arounds the world.";
        StringTokenizer token = new StringTokenizer(str.toLowerCase(),", .!|");//字符串变小写，分别用, !|分割字符串
			HashMap<String,Integer> map = new HashMap<>();//声明map集合
			while(token.hasMoreTokens()){//遍历
				String word = token.nextToken();//遍历次数放入word
				if(map.containsKey(word)){//看map是否有word值的key
					map.put(word,map.get(word)+1);//对已有的数量是+1
				}else{
					map.put(word,1);//对第一次统计到的是1
				}
			}
			System.out.println(map);//输出集合
			
			
			
    }
}
