package 动态代理;
import java.lang.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public class XiangQinZengQiang implements InvocationHandler {
	private Object target;
	//被代理对象的方法调用时方法的拦截器
	//proxy 代理商对象本身
	// method 被代理对象某个方法的调用
	// args 被调离对象方法调用传过来的参数
	// return 这个方法最终返回给调用者的值(如果你不愿意，此处可以不给调用者返回值)
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法"+method.getName()+"被调用钱");
		//真正调用被代理对象的方法
		Object object;
		return null;
	}

}
