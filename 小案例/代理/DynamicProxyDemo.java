package 代理;

import java.lang.reflect.Proxy;

import 动态代理.XiangQinZengQiang;

public class DynamicProxyDemo {
	public static void main(String[] args) {
		RuHua real = new RealRuHua();
		xiangqinzengqiang zengqiang = new xiangqinzengqiang();
		zengqiang.target = real;
		RuHua proxy = (RuHua) Proxy.newProxyInstance(
				DynamicProxyDemo.class.getClassLoader(), new Class[] { RuHua.class }, zengqiang);
		proxy.canYuxiangQin();
		proxy.showInfo();
	}
}
