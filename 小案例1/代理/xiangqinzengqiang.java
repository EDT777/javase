package 代理;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class xiangqinzengqiang implements InvocationHandler{
	public Object target;
/*
 * 被代理对象的方法调用时方法的拦截器
 * proxy 代理商对象本身
 * method 被代理对象某个方法的调用
 * args 被调离对象方法调用传过来的参数
 * return 这个方法最终返回给调用者的值(也可以不给调用值)
 * 
 * */
	@Override
	public Object invoke(Object proxy, Method method , Object[] args) throws Throwable {
	System.out.println("方法"+method.getName()+"被调用前");
	//真正调用被代理对象的方法
	Object object=method.invoke(target, args);
	System.out.println("方法："+method.getName()+"被调用后");
	
	return object;
	}

}
