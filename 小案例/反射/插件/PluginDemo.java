package 反射.插件;

import java.util.Scanner;

//测试插件
public class PluginDemo {
		public static void main(String[] args) throws InstantiationException, IllegalAccessException {
			System.out.println("请输入插件具体名");
			
		
			while(true) {
				Scanner scn = new Scanner(System.in);
				String pluginName = scn.next();
				if("quit".equalsIgnoreCase(pluginName)) {
					break;
				}
				
				Class clazz;
				try {
					clazz = Class.forName(pluginName);
					ShowInfoInterface plugin =(ShowInfoInterface) clazz.newInstance();
					plugin.shoInfo();
				} catch (ClassNotFoundException e) {
					System.out.println("找不到该类的实现");
				}
			
				
			}
		}
}
