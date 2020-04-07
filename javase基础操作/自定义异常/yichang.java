package 自定义异常;

public class yichang extends Exception{//编译时异常
	//定义异常一般提供2个构造方法
public yichang() {}

public yichang(String msg) {
	super(msg);
}
}
