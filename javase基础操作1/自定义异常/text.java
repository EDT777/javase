package 自定义异常;

public class text {

	public static void main(String[] args) {
		String name ="edggfgf";
		kehu k = new kehu();
		try {
			k.register(name);
		}catch(yichang e) 
		{System.out.println(e.getMessage());}
		
	}

}
