package 代理;

public class ProxyDemo {
public static void main(String[] args) {
	//代理模式的工作效果
	RuHua real = new RealRuHua();
	RuHuaProxy proxy = new RuHuaProxy();
	proxy.setTarget(real);//建立代理关系
	
	//代理参与相亲
	proxy.canYuxiangQin();
}
}
