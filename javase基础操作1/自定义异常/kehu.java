package 自定义异常;

public class kehu {
	//对外提供一个注册方法
public void register(String  name) throws yichang{
	if(name.length()<6) {
		//手动抛出异常
		throw new yichang("用户名长度不能少于6位");
	}
	System.out.println("注册成功");
}
}
